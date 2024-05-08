<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Création de catégorie</title>
</head>
<body>
<header>
    <h1>Création de catégorie</h1>
</header>
<main>
    <form action="saveCategory" method="post">
        <div>
            <label for="nom">Nom : </label>
            <input type="text" id="nom" name="nom">
        </div>
        <div>
            <label for="description">Description : </label>
            <input type="text" id="description" name="description">
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="CategoryList">Retour à la liste des catégories</a>
</footer>
</body>
</html>
