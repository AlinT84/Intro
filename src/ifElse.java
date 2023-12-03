import java.util.Scanner;

/*Flow control - if else
        - evalueaza conditii si bifurca codul in functie de rezultat
*/
public class ifElse {
    public static void main(String[] args) {
//        System.out.println("pornim radio");
//        boolean piesa_faina = true; // invat calculatorul daca piesa este faina sau nu
//        //daca piesa e frumoasa, dau mai tare
//        if (piesa_faina == true) {
//            System.out.println("dau mai tare radio");
//            System.out.println("incep sa fredonez piesa");
//        }
//        System.out.println("oprim radio");
//
//        //if else
//
//        //daca nr este par printam acest lucru, altfel printam impar
//        int nr = 4;
//        if (nr % 2 == 0) {
//            System.out.println("nr par");
//        } else {
//            System.out.println("impar");
//        }
//
//        //este un nr pozitiv?
//        if (nr > 0) {
//            System.out.println("pozitiv");
//        } else {
//            System.out.println("negativ");
//        }
//
//        // if, else if, else
//
//        // cum ne saluta robotelul in functie de ora?
//        // luam date de la tastatura
//        Scanner sc = new Scanner(System.in); //scanner = este un tip de date ( la fel ca string, int, char)
//        System.out.println("Introdu ora: ");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("ora invalida");
//        } else if (ora <= 11) {
//            System.out.println("buna dimineata");
//        } else if (ora <= 18) {
//            System.out.println("buna ziua");
//        } else if (ora <= 21) {
//            System.out.println("buna seara");
//        } else if (ora <= 24) {
//            System.out.println("noapte buna");
//        } else {
//            System.out.println("ora invalida");
//        }
        // CTRL + /  - pt a comenta/decomenta mai multe linii

        //switch
        //se foloseste cand stim valorile posibile (valori fixe) (exemplu robotelul de la telefonia mobila)
        System.out.println("alege optiunea: ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("RO");
                break;
            case 2:
                System.out.println("ENG");
                break;
            default:
                System.out.println("opt invalida");
        }
    }
}
