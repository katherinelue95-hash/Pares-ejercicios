import java.util.Scanner;

public class MatrizElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] elementos = new String[4][4];

        System.out.println("Ingrese los 16 nombres de elementos químicos:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                elementos[i][j] = sc.nextLine();
            }
        }

        System.out.println("\n--- Matriz de índices pares (4 elementos) ---");
        for (int i = 0; i < 4; i += 2) {
            for (int j = 0; j < 4; j += 2) {
                System.out.print(elementos[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
