package Firma;

public class Programista extends Pracownik_Firmy implements RolaWZespole{


    public Programista(String name, int wyplata, Enum zadanie) {
        super(name, wyplata, zadanie);
    }

    @Override
    public String rolaWZespole() {
        return "Moją rolą jest programowanie!";

    }





}
