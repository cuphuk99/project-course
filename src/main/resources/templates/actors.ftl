<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="margin-left: 5%; margin-top: 5%">
    <h1>Table of actors</h1>
    <table style="width: 80%">
        <tr>
            <th>Name</th>
            <th>Id</th>
            <th>Surname</th>
            <th>Patronymic</th>
            <th>Experience</th>
            <th>Rank</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Description</th>
            <th>Delete</th>
            <th>Edit</th>


        </tr>
        <#list actors as actors>
        <tr>
            <td>${actors.id}</td>
            <td>${actors.name}</td>
            <td>${actors.surname}</td>
            <td>${actors.patronymic}</td>
            <td>${actors.experience}</td>
            <td>${actors.rank}</td>
            <td>${actors.createdAt}</td>
            <td>${actors.updatedAt}</td>
            <td>${actors.description}</td>
            <td>
                <a href="/gui/actors/delete/${actors.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>
            </td>
            <td>
                <a href="/gui/actors/update/${actors.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>
            </td>

        </tr>
        </#list>
    </table>
    <a href="/gui/actors/create" > <input type="button" class="btn btn-success" value="Create"> </a>

</body>
</html>