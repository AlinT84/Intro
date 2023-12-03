import java.sql.SQLOutput;
import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite tipuri de date

        // String = sir de caractere delimitate de ""
        String marca = "Peugeot";
        String model = "208";

        // metode la Strings
        System.out.println(marca.toUpperCase()); //scris cu majuscule
        System.out.println(marca.length()); //nr de caractere

        String a = "3";
        String b = "4@";
        System.out.println(a+b);

        // Integer = numar intreg (int)
        int x = 40;
        int y = 4120;
        System.out.println(x+y);

        //Double = numar zecimal
        double pret = 2300.50;

        //boolean = adevarat (1) sau fals (0)
        boolean inmatriculata = false;

        //char = un singur caracter (poate fi orice caracter)
        char nota = 'A';
    }
}
