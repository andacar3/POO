//if it doesn't meet

package clase2;

import java.util.Scanner;

public class ejercicio_clase2 {

    public void Par_impar(int number) {

        int digit1 = number / 100;
        int digit2 = (number % 100) / 10;
        int digit3 = number % 10;
        if (digit1 % 2 == digit3 % 2) {
            System.out.println("no cumple");

        } else {
            System.out.println("si cumple");
        }

    }

    public void imprimir(int number) {
        ejercicio_clase2 par = new ejercicio_clase2();

        if (number >= 1000 || number < 100) {
            System.out.println("no cumple");

        } else {
            par.Par_impar(number);

        }

    }

    public static void main(String[] args) {

        ejercicio_clase2 lo = new ejercicio_clase2();

        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese un numero de 3 cifras");
        int number = tec.nextInt();
        int opcion;
        do {
            System.out.println("ingrese una opcion a realizar");
            System.out.println("1: para verificar el numero e imprimir");
            System.out.println("3: terminar el programa");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    lo.imprimir(number);
                    break;
                case 3:
                    System.out.println("saliendo");
                    break;
                default:
                    break;
            }
            System.out.println("angel");
        } while (opcion != 3);
    }

}
