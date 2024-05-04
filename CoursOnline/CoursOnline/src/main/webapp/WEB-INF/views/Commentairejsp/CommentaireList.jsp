<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des commentaires</title>
</head>
<body>
<header>
    <h1>Liste des commentaires</h1>
</header>
<main>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Contenu</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="commentaire" items="${commentaires}">
            <tr>
                <td>${commentaire.id}</td>
                <td>${commentaire.contenu}</td>
                <td>
                    <a href="editCommentaire?id=${commentaire.id}">Edit</a>
                    <a href="deleteCommentaire?id=${commentaire.id}" onclick="return confirm('Are you sure you want to delete this comment?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="CreateCommentaire">Créer un nouveau commentaire</a>
</footer>
</body>
</html>


