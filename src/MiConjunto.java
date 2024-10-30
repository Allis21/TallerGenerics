import java.util.HashSet;

public class MiConjunto<T> {
    private HashSet<T> conjunto = new HashSet<>();

    public void add(T elemento) {
        conjunto.add(elemento);
    }

    public void remove(T elemento) {
        conjunto.remove(elemento);
    }

    public boolean contains(T elemento) {
        return conjunto.contains(elemento);
    }

    public void mostrarElementos() {
        System.out.println(conjunto);
    }

    public static void main(String[] args) {
        MiConjunto<Integer> miConjunto = new MiConjunto<>();
        miConjunto.add(1);
        miConjunto.add(2);
        miConjunto.add(3);
        miConjunto.mostrarElementos();
        System.out.println("Contiene el número 2? " + miConjunto.contains(2));
        miConjunto.remove(2);
        miConjunto.mostrarElementos();
    }
}
