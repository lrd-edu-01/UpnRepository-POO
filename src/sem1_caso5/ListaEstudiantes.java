package sem1_caso5;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaEstudiantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        int cantidad = 0;

        // Validar que el usuario ingrese un número
        while (true) {
            try {
                System.out.print("¿Cuántos estudiantes desea registrar? ");
                cantidad = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                break;
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número válido.");
                sc.nextLine(); // Limpiar entrada incorrecta
            }
        }

        // Ingresar nombres
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            estudiantes.add(nombre);
        }

        // Mostrar lista completa
        System.out.println("\nLista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        sc.close();
    }
}