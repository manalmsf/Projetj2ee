<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title> Etudiant List</title>
    </head>
        <body>
            <header>
                <h1>
                    Etudiant List

                </h1>

            </header>
    <main>
        <table class ="table table-striped">
            <thead>
            <tr scope="col">ID</tr>
            <tr scope="col">nom</tr>
            <tr scope="col">prenom</tr>
            <tr scope="col">email</tr>
            <tr scope="col">phone</tr>
            </thead>
            <tbody>
                <c:forEach items ="${etudiantVue}" var= "etudiant">
                    <tr>

                        <td>${etudiant.id}</td>
                        <td>${etudiant.nom}</td>
                        <td>${etudiant.prenom}</td>
                        <td>${etudiant.email}</td>
                        <td>${etudiant.phone}</td>
                        <td>${etudiant.suivreCours}</td>
                        <td>
                            <a onclick="return confirm('Are you sure to delete this etudiant ?')"
                                    href="deleteEtudiant?id=${etudiant.id}">
                                Delete
                            </a>
                        </td>
                        <td>
                            <a
                               href="EditEtudiant?id=${etudiant.id}">
                                Delete
                            </a>
                        </td>

                </c:forEach>

            </tbody>
        </table>


    </main>
            </head>
            <footer>
                <a href="CreateEtudiant">Etudiant Creation</a>
            </footer>
        </body>
</html>