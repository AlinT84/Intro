import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elementele
        System.out.println(fructe.get(0) ); // mar

        //cum aflam index-ul unui element
        System.out.println(fructe.indexOf("banana")); //1

        //scoatem un element
        fructe.remove("mar");

        //listam elementele
        //System.out.println(Arrays.toString(fructe.toArray()));
        //sau
        System.out.println(fructe); //daca e transformat array in list

        //aflam dimensiunea listei
        System.out.println(fructe.size());

        //este lista goala?
        System.out.println(fructe.isEmpty()); // daca este goala

        if (!fructe.isEmpty()) {    //daca NU (!) este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        //eliminam toate elementele din lista
        fructe.clear();

        //este lista goala?

        if (!fructe.isEmpty()) {    //daca NU (!) este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});

        //listam elementele din lista "numere"
        //System.out.println(Arrays.toString(numere.toArray()));
        //sau
        System.out.println(numere); //daca e transformat array in list

        //declaram o lista dinamica
        String[] flowers = {"Argesium", "Allium", "Poppy", "Catmint"};
        List<String> flowerlist = new ArrayList<>(Arrays.asList(flowers));
        flowerlist.add("Rose");
        //System.out.println(Arrays.toString(flowerlist.toArray()));
        //sau
        System.out.println(flowerlist); //daca e transformat array in list

        // aflam unde este "Poppy" in functie de index
        int poppy_index = flowerlist.indexOf("Poppy");
        //stergem orice element va fi la acest index
        flowerlist.remove(poppy_index);
        //System.out.println(Arrays.toString(flowerlist.toArray()));
        //sau
        System.out.println(flowerlist); //daca e transformat array in list

        //scoatem in functie de valoare
        flowerlist.remove("Catmint");
        System.out.println(Arrays.toString(flowerlist.toArray()));
        //sau
        System.out.println(flowerlist); //daca e transformat array in list


        /*
        alte tipuri de structuri de date

        SET - lista de elemente in care fiecare element apare o singura data

        COADA - pers1, pers 2, pers 3 - FIFO (First IN, First Out)
        pop - scoate primul element => per2, per3

        STIVA - tip LIFO (Last In, First Out)
        ex: turnul din Hanoi

        cerc1   pop =>  cerc2
        cerc2           cerc3
        cerc3
         */

    }
}
