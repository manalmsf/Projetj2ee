<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Creation</title>
</head>
<body>
<header>
    <h1>Professeur Creation</h1>
</header>
<main>
    <form action="saveProfesseur" method="post">
        <div>
            <label for="nom">First Name : </label>
            <input type="text" id="nom" name="nom">
        </div>
        <div>
            <label for="prenom">Last Name: </label>
            <input type="text" id="prenom" name="prenom">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="number">Phone : </label>
            <input type="number" id="number" name="phone">
        </div>
        <div>
            <input type="submit" value="Save">:
        </div>
    </form>
</main>
<footer>
    <a href="professeurList"> List des profs</a>
</footer>
</body>
</html>