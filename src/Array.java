public class Array {
    public static void main(String[] args) {
        //declarare si initializare
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        // contine mai multe elemente de ACELASI tip
        // accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa (nu mai putem adauga alte elemente - 5+1)
        // are proprietatea lenght care ne da dimensiunea array-ului

        System.out.println(elevi[0]); //Gigel
        elevi[2]= "Sebi"; //suprascriere
        System.out.println(elevi[2]); // Sebi inloc de Mari
        System.out.println(elevi.length); // => 5
        //System.out.println(elevi[11]); => lenght out!!!!

        //putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]); // Gigel + Costel
        System.out.println(elevi.length + 5); // 10

        // putem altera leght=ul array-ului inaintea inceperii codului (ex: scoatem "Ada")
        // sa printam tot timpul ultimul element idiferent de marime
        System.out.println("Last place: " + elevi[elevi.length-1]); // => 5-1=4 (Ada) - cod dinamic

        //declarare si alocare de memorie
        int[] note = new int[5]; //0, 0, 0, 0, 0
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        note[2] = 10;
    }
}
