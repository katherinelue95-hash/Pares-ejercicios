import java.util.Scanner;

public class PuntosFutbol{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de partidos ganados: ");
        int ganados = leer.nextInt();

        System.out.print("Ingrese la cantidad de partidos empatados: ");
        int empatados = leer.nextInt();

        System.out.print("Ingrese la cantidad de partidos perdidos: ");
        int perdidos = leer.nextInt();

        // Cálculo de puntos según las reglas fijadas
        int puntosTotales = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        System.out.println("\n--- RESULTADO DEL TORNEO ---");
        System.out.println("Puntos totales obtenidos: " + puntosTotales);
    }
}
