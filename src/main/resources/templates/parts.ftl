<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Participation</title>
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
<body style=" margin-top: 5%">
<h1 style="text-align: center; margin-bottom: 5%;">Table of Participations</h1>
    <table style=" background: azure; margin: 5%">
        <tr>
            <th class="th">Id</th>
            <th class="th">Actor</th>
            <th class="th">Show</th>
            <th class="th">Description</th>
            <th class="th">Created At</th>
            <th class="th">Updated At</th>

            <th class="th">Delete</th>
            <th class="th">Edit</th>


        </tr>
        <#list parts as part>
        <tr>
            <td class="td">${part.id}</td>
            <td class="td">${part.actor}</td>
            <td class="td">${part.show}</td>
            <td class="td">${part.description}</td>
            <td class="td">${part.createdAt}</td>
            <td class="td">${part.updatedAt}</td>

            <td class="td">
                <a href="/gui/part/delete/${part.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>
            </td>
            <td  class="td">
                <a href="/gui/part/update/${part.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>
            </td>


        </tr>
        </#list>
    </table>
    <br>
    <a href="/gui/part/create" style="margin-left: 5%"> <input type="button" class="btn btn-success" value="Create"> </a>
    <a href="/" style="margin-left: 3%" class="btn btn-warning">Back to main page</a>

</body>
</html>