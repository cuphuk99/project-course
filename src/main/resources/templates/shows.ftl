<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shows</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="margin-left: 5%; margin-top: 5%">
    <h1>Table of Shows</h1>
    <table style="width: 80%">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Budget</th>
            <th>Year</th>
            <th>Delete</th>
            <th>Edit</th>


        </tr>
        <#list shows as show>
        <tr>
            <td>${show.id}</td>
            <td>${show.name}</td>
            <td>${show.description}</td>
            <td>${show.createdAt}</td>
            <td>${show.updatedAt}</td>
            <td>${show.budget}</td>
            <td>${show.year}</td>

            <td>
                <a href="/gui/shows/delete/${show.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>
            </td>
            <td>
                <a href="/gui/shows/update/${show.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>
            </td>

        </tr>
        </#list>
    </table>
    <a href="/gui/shows/create" > <input type="button" class="btn btn-success" value="Create"> </a>

</body>
</html>