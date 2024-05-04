<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Edition</title>
</head>
<body>
<header>
    <h1>Customer Edition</h1>
</header>
<main>
    <form action="updateProfesseur" method="post">
        <div>
            <label for="prenom">prenom : </label>
            <input type="text" id="prenom" name="prenom" value="${Profview.prenom}">
        </div>
        <div>
            <label hidden="hidden" for="id">id : </label>
            <input hidden="hidden" type="text" id="id" name="id" value="${Profview.id}">
        </div>
        <div>
            <label for="nom">nom : </label>
            <input type="text" id="nom" name="nom" value="${Profview.nom}">
        </div>
        <div>
            <label for="Phone">Phone : </label>
            <input type="number" id="Phone" name="Phone" value="${Profview.Phone}">
        </div>
        <div>
            <label for="Specialité">Specialité: </label>
            <input type="text" id="Specialité" name="Specialité" value="${Profview.Specialité}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="ProfesseurList">Professeur List</a>
</footer>
</body>
</html>
