<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update a show</title>

</head>
<body>

    <h1>Update</h1>

    <div>
        <fieldset>
            <legend>Update actor</legend>
            <form name="shows" action="" method="POST">
                Id:<@spring.formInput "form.id" "" "text"/>
                <br>
                Name:<@spring.formInput "form.name" "" "text"/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>
                <br>
                CreatedAt:<@spring.formInput "form.createdAt" "" "text"/>
                <br>
                UpdatedAt:<@spring.formInput "form.updatedAt" "" "text"/>
                <br>
                Budget:<@spring.formInput "form.budget" "" "text"/>
                <br>
                Year:<@spring.formInput "form.year" "" "text"/>



                <input type="submit" value="Update">
            </form>
        </fieldset>
    </div>

</body>
</html>