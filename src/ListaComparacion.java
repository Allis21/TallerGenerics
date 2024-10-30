import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// Ejercicio 1
public class ListaComparacion {
    public static void main(String[] args) {
        int elementos = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Medir el tiempo de inserción en ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < elementos; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de inserción en ArrayList: " + (endTime - startTime) + " ns");

        // Medir el tiempo de inserción en LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < elementos; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de inserción en LinkedList: " + (endTime - startTime) + " ns");

        // Tiempo de acceso por índice en ArrayList
        startTime = System.nanoTime();
        arrayList.get(elementos / 2);
        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso en ArrayList: " + (endTime - startTime) + " ns");

        // Tiempo de acceso por índice en LinkedList
        startTime = System.nanoTime();
        linkedList.get(elementos / 2);
        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso en LinkedList: " + (endTime - startTime) + " ns");

        // Tiempo de eliminación en ArrayList
        startTime = System.nanoTime();
        arrayList.remove(elementos / 2);
        endTime = System.nanoTime();
        System.out.println("Tiempo de eliminación en ArrayList: " + (endTime - startTime) + " ns");

        // Tiempo de eliminación en LinkedList
        startTime = System.nanoTime();
        linkedList.remove(elementos / 2);
        endTime = System.nanoTime();
        System.out.println("Tiempo de eliminación en LinkedList: " + (endTime - startTime) + " ns");
    }
}
