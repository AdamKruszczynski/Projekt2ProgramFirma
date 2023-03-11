package Firma;

public class Kierownik extends Pracownik_Firmy implements RolaWZespole{

    public Kierownik(String name, int wyplata, Enum zadanie) {
        super(name, wyplata, zadanie);
    }

    @Override
    public String rolaWZespole() {

        return "Moja rolą jest sprawdzanie rezultatów programistów!";
    }
}
