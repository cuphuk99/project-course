<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create</title>

</head>
<body>

    <h1>Creation</h1>

    <div>
        <fieldset>
            <legend>Add item</legend>
            <form name="actors" action="" method="POST">
                Name:<@spring.formInput "form.name" "" "text"/>
                <br>
                Surname:<@spring.formInput "form.surname" "" "text"/>
                <br>
                Patronymic:<@spring.formInput "form.patronymic" "" "text"/>
                <br>
                Experience:<@spring.formInput "form.experience" "" "text"/>
                <br>
                Rank:<@spring.formInput "form.rank" "" "text"/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>
                <input type="submit" value="Create">
            </form>
        </fieldset>
    </div>

</body>
</html>