import java.util.Scanner;

public class DescuentoRenta{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del empleado ($): ");
        double sueldo = leer.nextDouble();

        double descuento = 0.0;

        // Estructura condicional para evaluar los rangos de sueldo
        if (sueldo < 500.00) {
            descuento = 0.0;
        } else if (sueldo >= 500.00 && sueldo < 750.00) {
            descuento = sueldo * 0.05; // 5% de descuento
        } else if (sueldo >= 750.00) {
            descuento = sueldo * 0.10; // 10% de descuento
        }

        System.out.println("\n--- DETALLE DE PAGO ---");
        System.out.printf("Sueldo base: $%.2f\n", sueldo);
        System.out.printf("Monto a descontar en concepto de renta: $%.2f\n", descuento);
        System.out.printf("Sueldo neto a recibir: $%.2f\n", (sueldo - descuento));
    }
}


