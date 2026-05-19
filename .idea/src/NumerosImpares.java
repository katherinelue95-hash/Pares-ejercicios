import java.util.Scanner;

public class NumerosImpares{
    public static void main(String[] args){
        Scanner leer = new  Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int limite = leer.nextInt();

        System.out.println("\n--- NÚMEROS IMPARES ENTRE 0 Y " + limite + " ---");
        // Bucle for que recorre los números y evalúa si el residuo es diferente de 0
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Salto de línea final
    }
}


