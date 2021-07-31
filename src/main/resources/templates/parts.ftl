<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Particopation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="margin-left: 5%; margin-top: 5%">
    <h1>Table of Participations</h1>
    <table style="width: 80%">
        <tr>
            <th>Id</th>
            <th>Description</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Actor</th>
            <th>Show</th>
            <th>Delete</th>
            <th>Edit</th>


        </tr>
        <#list parts as part>
        <tr>
            <td>${part.id}</td>
            <td>${part.description}</td>
            <td>${part.createdAt}</td>
            <td>${part.updatedAt}</td>
            <td>${part.actor}</td>
            <td>${part.show}</td>

            <td>
                <a href="/gui/part/delete/${part.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>
            </td>
            <td>
                <a href="/gui/part/update/${part.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>
            </td>

        </tr>
        </#list>
    </table>
    <a href="/gui/part/create" > <input type="button" class="btn btn-success" value="Create"> </a>

</body>
</html>