package quiz;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner tec = new Scanner(System.in);

        


        llenar meth = new llenar();
        imprimir meth2 = new imprimir();

        System.out.println("cuantas cedulas desea llenar");
        int cantidad = tec.nextInt();
        int[] cedula = new int[cantidad];
        int[] edad = new int[cantidad];





        System.out.println("Opcion a realizar");
        System.out.println("1 para llenar el vector");
        System.out.println("2 para imprimir los vectores ya hechos");
        System.out.println("3 para modificar un vector ya existente");
        System.out.println("4 para salir");
        opcion = tec.nextInt();

        switch (opcion) {
            case 1:

            meth.fill(cedula,edad);
                
                break;
            case 2:

            meth2.print(edad, cedula);

                break;

            case 3:
                
                break;

            case 4:
            
                break;
        
            default:
                break;
        } while (opcion != 4);


    }
    
}
