/*
Operatori:
   aritmetici: +, -, *, /, % (modulo - ne da restul impartirii)
   de comparare: <, >, ==, != (diferit), <=, >=
   logici: &&, || (sau), ! (not - se pune in fata; intoarce rezultatul)
*/

public class Operatori {
    public static void main(String[] args) {
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; //sprascriere => a=5
        System.out.println(a - b);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); // rasp 0 (restul impartirii)
        System.out.println(11 % b); //raspuns 1 (restul impartirii)
        System.out.println(a < b); //false
        System.out.println(a > b); //false
        System.out.println(a == b); //true
        System.out.println(a != b); //false
        System.out.println(a <= b); //true
        System.out.println(a >= b); //true

        System.out.println(7 > b && 8 > b); //true
        System.out.println(7 > b || 8 > b); //true (ca sa fie adevarat trebuie sa fie adevarata doar o conditie)
        System.out.println(2 > b && (2>b || 3 > b)); //false && false => false
        System.out.println(7 > b || (2>b || 3 > b)); //true || false => true
        System.out.println(!(7 >b)); // !true => false
    }
}
