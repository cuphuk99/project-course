package edu.cuphuk.controller.gui;

import edu.cuphuk.form.PartUpdateForm;
import edu.cuphuk.model.Part;
import edu.cuphuk.model.Shows;
import edu.cuphuk.service.part.interfaces.IPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/gui/part")
public class PartGuiController {

    @Autowired
    private IPartService iPartService;

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

}
