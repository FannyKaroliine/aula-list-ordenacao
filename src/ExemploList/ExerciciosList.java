package ExemploList;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista chamada notas2 "
                + "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        List<Double> notas2 = new ArrayList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-la: " + notas2.get(0));

        System.out.println("\nMostre a primeira nota da nova lista removendo-a: ");
        notas2.remove(0);
        System.out.println(notas2.get(0));


    }

}
