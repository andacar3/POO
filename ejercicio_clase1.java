
/**
 * ejercicio_clase1
 */
import java.util.Scanner;

public class ejercicio_clase1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int opcion = 0;
        System.out.println("1: imprimir solo numeros de 0-200 ");
        System.out.println("2: imprimir numeros excepto 50 y 20 ");
        System.out.println("3: evaluar cifras pares e impares, imprimir si cifra par e impar");
        System.out.println("4: salir del programa");
        opcion = tec.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 0; i < 200; i++) {
                    int number = i;
                    System.out.println(number);
                }
                break;
            case 2:
                for (int i = 0; i < 200; i++) {
                    int number = i;
                    if (number == 50 || number == 20) {
                        System.out.println("se salta este numero");
                        continue;
                    } else {
                        System.out.println(number);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 200; i++) {
                    int number = i;
                    if (number == 50 || number == 20) {
                        System.out.println("se salta este numero");
                        continue;
                    } else {
                        if (number >= 100) {
                            int digit1 = number / 100;
                            int digit2 = (number % 100) / 10;
                            int digit3 = number % 10;
                            System.out.println(number);
                        } else {
                            if (number >= 10) {
                                int digit1 = 0;
                                int digit2 = number / 10;
                                int digit3 = number % 10;
                                if (digit2 == digit3 || digit3 % 2 == digit2 % 2) {
                                    System.out.println("se salta este numero");
                                    continue;
                                } else {
                                    System.out.println(number);
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
                opcion = 4;
            default:
                System.out.println("opcion no valida, intente nuevamente");
                break;
        }
        while (opcion != 4)
            ;
    }
} 
