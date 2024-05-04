<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Professeur List</title>
</head>
<body>
<header>
    <h1>Professeur List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
        <th scope="col">ID</th>
        <th scope="col">nom</th>
        <th scope="col">prenom</th>
        <th scope="col">Phone</th>
        <th scope="col">Specialité</th>

        </tr>
        </thead>

<tbody>
<c:forEach items ="${Profview}" var= "Professeur">
    <tr>

    <td>${Professeur.id}</td>
    <td>${Professeur.nom}</td>
    <td>${Professeur.prenom}</td>
    <td>${Professeur.Specialité}</td>
    <td>${Professeur.phone}</td>
    </tr>>


    <a onclick="return confirm('Are you sure to delete this teacher ?')"
    href="deleteProfesseur?id=${Professeur.id}">
    Delete
    </a>
    </tr>
    <a onclick="return confirm('Are you sure to change ')"
    href="EditProfesseur?id=${Professeur.id}">
    Edit
    </a>
    </td>

    </tbody>

    </table>


</main>
<footer>
    <a href="CreateProfesseur">Professeur Creation</a>
</footer>
</body>
</html>
