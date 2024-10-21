import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        int cantidadEstudiantes = 0;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        String confirmar;

        System.out.println("Ingrese el nombre de la Universidad: ");
        String nombreUniversidad = sc.nextLine();

        Universidad universidad = new Universidad(nombreUniversidad);

        do {
            System.out.println("Estudiante " + (cantidadEstudiantes + 1) + ": ");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();

            double[] notas = new double[3];
            System.out.println("Nota en Ecuaciones Diferenciales: ");
            notas[0] = sc.nextDouble();
            sc.nextLine(); // Consumir la línea sobrante

            System.out.println("Nota en Programacion: ");
            notas[1] = sc.nextDouble();
            sc.nextLine(); // Consumir la línea sobrante

            System.out.println("Nota en Fisica: ");
            notas[2] = sc.nextDouble();
            sc.nextLine(); // Consumir la línea sobrante

            Estudiante estudiante = new Estudiante(nombre, notas);
            universidad.agregarEstudiante(nombre, notas);

            System.out.println("Ingresar otro estudiante? Si/No");
            confirmar = sc.nextLine();

            if (confirmar.equalsIgnoreCase( "No")) {
                continuar = false;
            }
            cantidadEstudiantes++;

        } while (continuar);

        universidad.verDetalle();
    }
}