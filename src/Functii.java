public class Functii {
    // functie - logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem definio functie in alta functie (nu pot instala firefox in chrome)


    // o  functie simpla care ne printeaza ceva pe ecran
    // nu ne da niciun raspuns (nu are return)
    // nu are parametri
    public static void printGreeting() { // publica-poate fi acceseaza de oriunde din orice clasa;static-nu opereaza cu obiecte; void-nu ne returneaza niciun raspuns
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o  functie simpla care saluta clientul in f de numele lui
    // nu ne da niciun raspuns (nu are return)
    // are nevoie parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie simpla care calculeaza media a 3 numere
    // ne da un raspuns (are return/returneaza) - ne va da suma
    // ce tip de date va avea raspunsul? 3 + 6 / 2 = 4.5 => double
    // are nevoie parametri
    // putem sa salvam rezultatul intr-o variabila
    public static double mediaNr (double a, double b, double c) {
        double media = a + b + c / 3;
        return media;
    }

    // o functie simpla care ne da valoarea lui pi
    // ne da un raspuns? da (are return/returneaza)
    // ce tip de date va avea raspunsul? pi = 3.14 => double
    // are nevoie parametri? nu (valoare lui pi este aceeasi)
    public static double piValue () { //nu am pus parametri in ()
        // constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }


    public static void main(String[] args) {
        // apelam o  functie simpla care ne printeaza ceva pe ecran
        // intra clientul 1
        printGreeting(); //se apeleaza fucntia; ne dam seama ca este o funtie daca are ()

        //intra clientul 2
        printGreeting(); // CTRL + clik pe f => ne duce la corpul ei

        //apelam o functie cu parametri oferint argumente
        printGreetingByName("Popescu", "Gigi");
        printGreetingByName("Tudoran", "Ana");
        printGreetingByName("Ionescu", "Calin");

        // apelam o  functie simpla care calculeaza media a 3 numere
        System.out.println(mediaNr(3, 3, 4));
        //apelam f si salvam rezultatul intr-o variabila
        double media1 = mediaNr(3123, 3123, 456);
        double media2 = mediaNr(31, 23, 56);
        double media3 = mediaNr(23, 12, 45);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        // o functie simpla care ne da valoarea lui pi
        System.out.println(piValue());
        System.out.println(piValue());

        //tema: aria unui dreptunghi
        //aria cercului
        //suma a 2 nr
        //o f care returneaza cate caractere are numele + prenumele
//        String nume = "Andy";
//        System.out.println(nume.length());
    }
}
