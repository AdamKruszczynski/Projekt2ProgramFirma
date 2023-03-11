package Firma;

import java.util.Objects;

public class Pracownik_Firmy {

    String name;
    Enum zadanie;
    int wyplata;

    public Pracownik_Firmy(String name,int wyplata, Enum zadanie){
        this.name = name;
        this.wyplata = wyplata;
        this.zadanie = zadanie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik_Firmy that = (Pracownik_Firmy) o;
        return wyplata == that.wyplata && Objects.equals(zadanie, that.zadanie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zadanie, wyplata);
    }

    @Override
    public String toString() {
        return "Pracownik_Firmy{" +
                "name='" + name + '\'' +
                ", zadanie=" + zadanie +
                ", wyplata=" + wyplata +
                '}';
    }
}
