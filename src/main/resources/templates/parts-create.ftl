<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create a participation</title>

</head>
<body>

    <h1>Creation</h1>

    <div>
        <fieldset>
            <legend>Add item</legend>
            <form name="actors" action="" method="POST">
                Actor: <@spring.formSingleSelect "form.actor" actors ""/>
                <br>
                Show: <@spring.formSingleSelect "form.show" shows ""/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>
                <input type="submit" value="Create">
            </form>
        </fieldset>
    </div>

</body>
</html>