package Firma;

public class Main {

    public static void main(String[] args) {

//        Programista Kuba = new Programista("Kuba", 11000);
//        Programista Milosz = new Programista("Milosz", 8000);
//        Kierownik Oliwer = new Kierownik("Oliwier", 10000);
//        Kierownik Filip = new Kierownik("Filip", 12000);
//        Prezes Hubert = new Prezes("Hubert", 20000);


        Pracownik_Firmy Kacper = new Programista("Kacper", 6000, Zadanie.PISAC_KOD);
        Pracownik_Firmy Michal = new Programista("Michal", 12000, Zadanie.PISAC_KOD);
        System.out.println(Kacper);
        System.out.println(Michal);

        System.out.println(Kacper.equals(Michal));


    }
}
