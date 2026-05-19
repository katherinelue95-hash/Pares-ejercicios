import java.util.Scanner;

public class CalculadoraExamen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de respuestas correctas: ");
        int correctas = teclado.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int incorrectas = teclado.nextInt();

        System.out.print("Ingrese el número de respuestas vacías: ");
        int vacias = teclado.nextInt();

        int puntajeTotal = (correctas * 5) + (incorrectas * -2) + (vacias * 0);

        int puntajeMaximo = correctas * (correctas + incorrectas + vacias);

        System.out.println("\n--- Resultados ---");
        System.out.println("El puntaje total obtenido es: " + puntajeTotal + " de " + puntajeMaximo);

        teclado.close();
    }
}
