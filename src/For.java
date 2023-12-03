public class For {
    public static void main(String[] args) {
        // for - loop, structura repetitiva
        // de unde incepem?
        // pana unde mergem?
        // pasul pe care il parcurge

        // problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++) { //i++ = i+1
            // i = 1 apoi i = 2 pana la i = 101; la i = 102 iasa din loop pt ca 102 > 101
            System.out.println("dalmatianul cu nr " + i);
        }

        //ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 15, 32}; //numere[0] = 3; avem in spate index
        for (int i = 0; i < numere.length; i = i + 2) { //parcurgem din 2 in 2
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }

        //for each - parcurge toate elementele si ajunge direct la valoare
        for (int numar : numere) {
            System.out.println("Numarul este: " + numar);
        }

        //parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }

        // suma (s) numerelor dintr-un array
        int s = 0;
        for (int numar : numere) {  //s=3, 7
            s = s + numar; //0+3=3, 3+7=10, 10+10=20, 20+15=35, 35+32=67
        }
        System.out.println(s);
    }
}