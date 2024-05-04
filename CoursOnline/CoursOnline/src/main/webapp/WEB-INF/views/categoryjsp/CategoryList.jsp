<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des catégories</title>
</head>
<body>
<header>
    <h1>Liste des catégories</h1>
</header>
<main>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Nom</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="category" items="${categories}">
            <tr>
                <td>${category.id}</td>
                <td>${category.nom}</td>
                <td>${category.description}</td>
                <td>
                    <a href="editCategory?id=${category.id}">Edit</a>
                    <a href="deleteCategory?id=${category.id}" onclick="return confirm('Are you sure you want to delete this category?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="CreateCategory">Créer une nouvelle catégorie</a>
</footer>
</body>
</html>
