<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create a participation</title>
    <style>
        body {
            background: url(https://html5book.ru/wp-content/uploads/2015/07/background39.png);
        }
        .button7 {
            font-weight: 700;
            color: white;
            text-decoration: none;
            padding: .8em 1em calc(.8em + 3px);
            border-radius: 3px;
            background: rgb(64,199,129);
            box-shadow: 0 -3px rgb(53,167,110) inset;
            transition: 0.2s;
        }
        .button7:hover { background: rgb(53, 167, 110); }
        .button7:active {
            background: rgb(33,147,90);
            box-shadow: 0 3px rgb(33,147,90) inset;
        }

    </style>
</head>
<body>

    <h1 style="text-align: center; ">Create new participation</h1>

    <div>
        <fieldset>
            <legend style="font-size: 22px;">Add participation</legend>
            <form name="actors" action="" method="POST" style="font-size: 20px; ">
                Actor: <@spring.formSingleSelect "form.actor" actors ""/>
                <br>
                Show: <@spring.formSingleSelect "form.show" shows ""/>
                <br>
                Description:<@spring.formInput "form.description" "" "text"/>
                <input type="submit" value="Create" class="button7">
            </form>
        </fieldset>
    </div>

</body>
</html>