import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila <T>{
    private ArrayList<T> elementos = new ArrayList<>();

    public void push(T item) {
        elementos.add(item);
    }

    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    public T peek() {
        if (elementos.isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Cima de la pila: " + pila.peek());
        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("Cima de la pila después de pop: " + pila.peek());
    }
}
