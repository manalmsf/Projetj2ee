<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Professeur</title>
</head>
<body>
<header>
    <h1>Creation Professeur</h1>
</header>
<main>
    <form action="saveProfesseur(" method="post">
        <div>
            <label for="firstName">First Name : </label>
            <input type="text" id="firstName" name="nom">
        </div>
        <div>
            <label for="lastName">Last Name : </label>
            <input type="text" id="lastName" name="prenom">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="phone">Phone: </label>
            <input type="text" id="phone" name="phone">
        </div>
        <div>
            <label for="specialite">Specialite: </label>
            <input type="text" id="specialite" name="specialite">
        </div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="professeurList">Customers List</a>
</footer>
</body>
</html>