<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Table of actors</h1>
    <table>
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
        </tr>
        </#list>
    </table>

</body>
</html>