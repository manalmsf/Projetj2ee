<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Création de cours</title>
</head>
<body>
<header>
    <h1>Création de cours</h1>
</header>
<main>
    <form action="saveCours" method="post">
        <div>
            <label for="titre">Titre : </label>
            <input type="text" id="titre" name="titre">
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
    <a href="CoursList">Retour à la liste des cours</a>
</footer>
</body>
</html>
