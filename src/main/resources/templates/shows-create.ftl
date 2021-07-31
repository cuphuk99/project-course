<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create a show</title>

</head>
<body>

    <h1>Creation</h1>

    <div>
        <fieldset>
            <legend>Add item</legend>
            <form name="shows" action="" method="POST">
                Name:<@spring.formInput "form.name" "" "text"/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>
                <br>
                Budget:<@spring.formInput "form.budget" "" "text"/>
                <br>
                Year:<@spring.formInput "form.year" "" "text"/>
                <br>
                <input type="submit" value="Create">
            </form>
        </fieldset>
    </div>

</body>
</html>