package OOP_LR6.Abiturient;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Abiturient implements Serializable {
    private int ID;
    private String Surname;
    private String Name;
    private String FName;
    private String Address;
    private int Phone;
    private double Mark;

    @Override
    public String toString() {
        return " id: " + ID +
                " || ПІБ: " + Surname +
                " " + Name +
                " " + FName +
                " || Адреса: " + Address +
                " || Телефон: " + Phone +
                " || Середній бал: " + Mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abiturient that)) return false;
        return ID == that.getID() &&
                Phone == that.getPhone() &&
                Double.compare(that.getMark(), Mark) == 0 &&
                Objects.equals(Surname, that.getSurname()) &&
                Objects.equals(Name, that.getName()) &&
                Objects.equals(FName, that.getFName()) &&
                Objects.equals(Address, that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Surname, Name, FName, Address, Phone, Mark);
    }

    public void printAbiturients(ArrayList<Abiturient> abiturients) {
        for (Abiturient abiturient : abiturients) {
            if (abiturient == null) break;
            System.out.println(abiturient);
        }
    }

    public ArrayList<Abiturient> addNew(ArrayList<Abiturient> abiturients, Abiturient newAbiturient) {
        abiturients.add(newAbiturient);
        return abiturients;
    }

    public ArrayList<Abiturient> delete(ArrayList<Abiturient> abiturients, int id) {
        abiturients.removeIf(abiturient -> abiturient.getID() == id);
        return abiturients;
    }
}


