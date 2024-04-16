package quiz2.main;

import java.util.Scanner;

import quiz2.menu;
import quiz2.fill.llenar;
import quiz2.search.search;

public class main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        

        System.out.println("cuantos numeros desea incluir");
        int cantidad = tec.nextInt();
        int[] numbers = new int[cantidad];

        main meth = new main();

        meth.menu(numbers, cantidad);
        

         
    }

    public void menu(int[] numbers, int cantidad) {

        System.out.println("eliga la opcion a realizar");
        System.out.println("1. llenar");
        System.out.println("2. buscar los numeros primos");
        System.out.println("3. operar");
        System.out.println("4. terminar el programa");
        Scanner tec = new Scanner(System.in);
        int opcion = tec.nextInt();


        llenar meth = new llenar();
        search meth2 = new search();
        switch (opcion) {
            case 1:
            meth.fill(numbers, cantidad);
                
                break;
            case 2:
            meth2.look(numbers, cantidad);

                break;
        
            default:
                break;
        }while (opcion != 4);


        
    }
    
}
