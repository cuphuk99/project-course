<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update participation</title>

</head>
<body>

    <h1>Update</h1>

    <div>
        <fieldset>
            <legend>Update participation</legend>
            <form name="actors" action="" method="POST">
                Id:<@spring.formInput "form.id" "" "text"/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>
                <br>
                CreatedAt:<@spring.formInput "form.createdAt" "" "text"/>
                <br>
                UpdatedAt:<@spring.formInput "form.updatedAt" "" "text"/>
                <br>
                Actor:<@spring.formSingleSelect "form.actor" actors ""/>
                <br>
                Show:<@spring.formSingleSelect "form.show" shows ""/>


                <input type="submit" value="Update">
            </form>
        </fieldset>
    </div>

</body>
</html>