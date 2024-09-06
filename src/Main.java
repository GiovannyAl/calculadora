import Funciones.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();
        double resultado;

        switch (opcion) {
            case 1:
                suma suma = new suma(numero1, numero2);
                resultado = suma.calcular();
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resta resta = new resta(numero1, numero2);
                resultado = resta.calcular();
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                multiplicacion multiplicacion = new multiplicacion(numero1, numero2);
                resultado = multiplicacion.calcular();
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                division division = new division(numero1, numero2);
                resultado = division.calcular();
                if (!Double.isNaN(resultado)) {
                    System.out.println("El resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        scanner.close();
    }
}