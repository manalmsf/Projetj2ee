<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Création de commentaire</title>
</head>
<body>
<header>
    <h1>Création de commentaire</h1>
</header>
<main>
    <form action="saveCommentaire" method="post">
        <div>
            <label for="contenu">Contenu : </label>
            <input type="text" id="contenu" name="contenu">
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="CommentaireList">Retour à la liste des commentaires</a>
</footer>
</body>
</html>
