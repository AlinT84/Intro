package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop - ne folosim de logica unui ContBancar (program files)

        // initializam obiecte de tip ContBancar
        // sunt instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("AlinT","RO001");
        ContBancar cont2 = new ContBancar("AdinaA", "RO002");

//        // apelam metoda descriere
//        cont1.interogareSold();
//        cont2.interogareSold();

        // activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(5555);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        //negative testing (cheltuim mai mult decat avem)
        cont1.plataCard(500);  // nu, 300.50 => pass

        // positive cu suma exacta
        cont1.plataCard(300.50);  // da, 0 => pass

        //positive de 2X
        cont2.plataCard(100); //da,900 => pass
        cont2.plataCard(200); //da,700 => pass

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
