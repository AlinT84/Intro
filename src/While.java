public class While {
    public static void main(String[] args) {
        //while  - loop - zona de cod care se repeta atat timp cat o conditie este true

        //problema: masina merge cat timp are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            //acceleram
            System.out.println("Vruuummm Vruuummmm");
            //scadem benzina
            litri_benzina = litri_benzina - 1;
            //aprindem belculetul cand avem <= 3 litri
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
