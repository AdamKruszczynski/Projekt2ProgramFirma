package Firma;

public class Prezes extends Pracownik_Firmy implements RolaWZespole{

    public Prezes(String name, int wyplata, Enum zadanie) {
        super(name, wyplata, zadanie);
    }

    @Override
    public String rolaWZespole() {
        return "Moją rolą jest zarządzanie firmą!";
    }
}
