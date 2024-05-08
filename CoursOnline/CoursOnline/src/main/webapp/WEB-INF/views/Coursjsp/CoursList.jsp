<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des cours</title>
</head>
<body>
<header>
    <h1>Liste des cours</h1>
</header>
<main>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Titre</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="cours" items="${cours}">
            <tr>
                <td>${cours.id}</td>
                <td>${cours.titre}</td>
                <td>${cours.description}</td>
                <td>
                    <a href="editCours?id=${cours.id}">Edit</a>
                    <a href="deleteCours?id=${cours.id}" onclick="return confirm('Are you sure you want to delete this course?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="CreateCours">Créer un nouveau cours</a>
</footer>
</body>
</html>
