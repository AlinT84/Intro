public class Variabile {
    public static void main(String[] args) {
        //decalrare si initializare variabile
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // strongly typed - trebuie sa specificam tipul de date

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // suprascrierea
        modelMasina = "XC 60 Facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //declararea
        String nume;
        String prenume;

        //initializare
        nume = "Tcaciuc";
        prenume = "Alin";
        int varsta = 34;

        //concatenare de string-uri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta);
    }
}
