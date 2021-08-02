package edu.cuphuk.controller.gui;

import edu.cuphuk.form.ActorsCreateForm;
import edu.cuphuk.form.PartCreateForm;
import edu.cuphuk.form.PartUpdateForm;
import edu.cuphuk.form.ShowsUpdateForm;
import edu.cuphuk.model.Actors;
import edu.cuphuk.model.Part;
import edu.cuphuk.model.Shows;
import edu.cuphuk.repository.ActorsMongoRepository;
import edu.cuphuk.repository.PartMongoRepository;
import edu.cuphuk.repository.ShowsMongoRepository;
import edu.cuphuk.service.part.interfaces.IPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/gui/part")
public class PartGuiController {

    @Autowired
    private IPartService iPartService;

    @Autowired
    private ActorsMongoRepository actorsRepository;

    @Autowired
    private ShowsMongoRepository showRepository;

    @RequestMapping("/all")
    public String getAll(Model model){
        List<Part> parts = iPartService.getAll();
        List<PartUpdateForm> partForms = parts.stream()
                .map(PartUpdateForm::new)
                .collect(Collectors.toList());
        model.addAttribute("parts", partForms);
        return "parts";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(Model model, @PathVariable("id") String id){
        iPartService.delete(id);

        return "redirect:/gui/part/all";
    }

    @GetMapping("/create")
    public String create(Model model){
        Map<String, String> showsMap = getShowsMap();
        Map<String, String> actorsMap = getActorsMap();
        PartCreateForm formToCreate = new PartCreateForm();
        model.addAttribute("shows", showsMap);
        model.addAttribute("actors", actorsMap);
        model.addAttribute("form", formToCreate);
        return "parts-create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("form") PartCreateForm form){
        Part part = new Part();
        String[] actorData = form.getActor().split(" ");

        List<Actors> actors = actorsRepository.findByNameAndSurnameAndPatronymic(actorData[0], actorData[1], actorData[2]);
        part.setActor(actors.get(0));
        List<Shows> shows =  showRepository.findByName(form.getShow());
        part.setShow(shows.get(0));
        part.setDescription(form.getDescription());
        iPartService.create(part);
        return "redirect:/gui/part/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") String id){
        Part part = iPartService.get(id);
        PartUpdateForm formToUpdate = new PartUpdateForm();
        Map<String, String> showsMap = getShowsMap();
        Map<String, String> actorsMap = getActorsMap();
        model.addAttribute("shows", showsMap);
        model.addAttribute("actors", actorsMap);
        formToUpdate.setId(part.getId());
        formToUpdate.setDescription(part.getDescription());
        formToUpdate.setCreatedAt(part.getCreatedAt());
        formToUpdate.setUpdatedAt(part.getUpdatedAt());
        formToUpdate.setActor(part.getActor().getName() + " " + part.getActor().getSurname() + " " + part.getActor().getPatronymic());
        formToUpdate.setShow(part.getShow().getName());


        model.addAttribute("form", formToUpdate);
        return "parts-update";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("form") PartUpdateForm form,  @PathVariable("id") String id){
        Part part = iPartService.get(id);
        String[] actorData1 = form.getActor().split(" ");
        List<Actors> actors = actorsRepository.findByNameAndSurnameAndPatronymic(actorData1[0], actorData1[1], actorData1[2]);
        part.setActor(actors.get(0));
        List<Shows> shows =  showRepository.findByName(form.getShow());
        part.setShow(shows.get(0));
        part.setId(form.getId());
        part.setDescription(form.getDescription());
        part.setUpdatedAt(LocalDateTime.now());
        iPartService.update(part);
        ///shows.setDescription(form.getDescription());
        return "redirect:/gui/part/all";
    }

    private Map<String, String> getShowsMap() {
        Map<String, String> showsMap = new LinkedHashMap<>();
        List<Shows> shows = showRepository.findAll();
        shows.stream()
                .map(Shows::getName)
                .forEach(stringName -> showsMap.put(stringName, stringName));
        return showsMap;
    }

    private Map<String, String> getActorsMap() {
        Map<String, String> actorsMap = new LinkedHashMap<>();
        List<Actors> actors = actorsRepository.findAll();
        actors.stream()
                .map(actor -> actor.getName() + " " + actor.getSurname() + " " + actor.getPatronymic())
                .forEach(stringName -> actorsMap.put(stringName, stringName));
        return actorsMap;
    }

}
