public class Caja <T>{
    private T contenido;

    public void poner(T item) {
        this.contenido = item;
    }

    public T sacar() {
        T temp = contenido;
        contenido = null;
        return temp;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    public static void main(String[] args) {
        Caja<String> caja = new Caja<>();
        caja.poner("Hola Mundo");
        System.out.println("Contenido de la caja: " + caja.sacar());
        System.out.println("La caja está vacía? " + caja.estaVacia());
    }
}
