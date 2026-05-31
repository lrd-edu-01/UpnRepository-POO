package sem1_caso2;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 20;

        Persona persona2 = new Persona();
        persona2.nombre = "María";
        persona2.edad = 25;

        System.out.println("Datos de la Persona 1:");
        persona1.mostrarDatos();

        System.out.println("\nDatos de la Persona 2:");
        persona2.mostrarDatos();
    }
}
