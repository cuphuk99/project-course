<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update</title>

</head>
<body>

    <h1>Update</h1>

    <div>
        <fieldset>
            <legend>Update actor</legend>
            <form name="actors" action="" method="POST">
                Id:<@spring.formInput "form.id" "" "text"/>
                <br>
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
                CreatedAt:<@spring.formInput "form.createdAt" "" "text"/>
                <br>
                UpdatedAt:<@spring.formInput "form.updatedAt" "" "text"/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>

                <input type="submit" value="Update">
            </form>
        </fieldset>
    </div>

</body>
</html>