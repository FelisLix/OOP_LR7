package OOP_LR6.Abiturient;

import java.util.*;

public class Filter {
    public Abiturient findAbiturient(ArrayList<Abiturient> abiturients, int ID){
        Abiturient res = new Abiturient();
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getID() == ID) {
                res = abiturient;
            }
        }
        return res;
    }
    public ArrayList<Abiturient> AbiturientsName(ArrayList<Abiturient> abiturients, String name){
        ArrayList<Abiturient> abs = new ArrayList<>();
        abiturients.sort(Comparator.comparingDouble(Abiturient::getMark).reversed());
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getName().equals(name)){
                abs.add(abiturient);
            }
        }
        return abs;
    }

    public ArrayList<Abiturient> AbiturientsMarkHigherThen(ArrayList<Abiturient> abiturients, double mark){
        ArrayList<Abiturient> abs = new ArrayList<>();
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getMark() > mark){
                abs.add(abiturient);
            }
        }
        return abs;
    }

    public ArrayList<Abiturient> AbiturientsWithHigherMark(ArrayList<Abiturient> abiturients, int n){
        ArrayList<Abiturient> abs = new ArrayList<>();
        abiturients.sort(Comparator.comparingDouble(Abiturient::getMark).reversed());
        for (int i = 0; i < n; i++){
            abs.add(abiturients.get(i));
        }
        return abs;
    }

    public ArrayList<Abiturient> printAlphabetOrder(ArrayList<Abiturient> abiturients){
        abiturients.sort(Comparator.comparing(Abiturient::getSurname).thenComparing(Abiturient::getName));
        return new ArrayList<>(abiturients);
    }
}



