package sem1_caso3;

public class Main {

    public static void main(String[] args) {

        Operacion op = new Operacion();

        System.out.println("Suma de 2 enteros: " + op.sumar(10, 5));
        System.out.println("Suma de 2 decimales: " + op.sumar(10.5, 5.2));
        System.out.println("Suma de 3 enteros: " + op.sumar(10, 5, 3));
    }
}
