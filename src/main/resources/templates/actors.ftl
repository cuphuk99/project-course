<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Actors</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style type="text/css">
        .th{
            padding: 10px;
            border: 1px solid lightgrey;
            text-align: center;
        }
        .td{
            padding: 10px;
            border: 1px solid lightgrey;
        }
        body {
            background: url(https://html5book.ru/wp-content/uploads/2015/07/background39.png);
        }
    </style>
</head>
<body style="margin-top: 5%">
    <h1 style="text-align: center; margin-bottom: 5%;">Table of actors</h1>
    <table style="background: azure; margin: 5%">
        <tr>
            <!-- <th class="th">Id</th> -->
            <th class="th">Name</th>
            <th class="th">Surname</th>
            <th class="th">Patronymic</th>
            <th class="th">Experience</th>
            <th class="th">Rank</th>
            <th class="th">Created At</th>
            <th class="th">Updated At</th>
            <th class="th">Description</th>
            <th class="th">Delete</th>
            <th class="th">Edit</th>


        </tr>
        <#list actors as actors>
        <tr>
            <!-- <td class="td">$ {actors.id}</td> -->
            <td class="td">${actors.name}</td>
            <td class="td">${actors.surname}</td>
            <td class="td">${actors.patronymic}</td>
            <td class="td">${actors.experience}</td>
            <td class="td">${actors.rank}</td>
            <td class="td">${actors.createdAt}</td>
            <td class="td">${actors.updatedAt}</td>
            <td class="td">${actors.description}</td>
            <td class="td">
                <a href="/gui/actors/delete/${actors.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>
            </td>
            <td class="td">
                <a href="/gui/actors/update/${actors.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>
            </td>

        </tr>
        </#list>
    </table>
    <a href="/gui/actors/create" style="margin-left: 5%"> <input type="button" class="btn btn-success" value="Create"></a>
    <a href="/" style="margin-left: 3%" class="btn btn-warning">Back to main page</a>

</body>
</html>