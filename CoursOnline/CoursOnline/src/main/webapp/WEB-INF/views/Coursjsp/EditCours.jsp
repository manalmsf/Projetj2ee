<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modification de cours</title>
</head>
<body>
<header>
    <h1>Modification de cours</h1>
</header>
<main>
    <form action="updateCours" method="post">
        <input type="hidden" name="id" value="${cours.id}">
        <div>
            <label for="titre">Titre : </label>
            <input type="text" id="titre" name="titre" value="${cours.titre}">
        </div>
        <div>
            <label for="description">Description : </label>
            <input type="text" id="description" name="description" value="${cours.description}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="CoursList">Retour à la liste des cours</a>
</footer>
</body>
</html>
