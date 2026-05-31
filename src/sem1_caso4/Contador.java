package sem1_caso4;

class Contador {

    static int contador = 0;

    public Contador() {
        contador++;
    }

    public static void mostrarContador() {
        System.out.println("Objetos creados: " + contador);
    }

}