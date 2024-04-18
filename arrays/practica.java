package arrays;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * practica
 */
public class practica {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        long cedula = 0;
        String nombre = "";
        String email = "";
        ArrayList<metodo> vecDim = new ArrayList<metodo>();

        
        int opcion = 0;

        
        do{
        System.out.println("1 para agregar, 2 para imprimir, 3 para salir");
        opcion = tec.nextInt();
        switch (opcion) {
            case 1:                     
                System.out.println("digite cedula");
                cedula = tec.nextLong();
                tec.nextLine();
                System.out.println("digite su nombre");
                nombre = tec.nextLine();
                System.out.println("digite su email");
                email = tec.nextLine();
                metodo meth = new metodo(cedula,nombre,email); 
                vecDim.add(meth);              
                break;
            case 2:
                for (metodo metodo : vecDim) {
                    System.out.println("datos personales\n"+metodo);                    
                }
                break;
        
            default:
                break;
        }    
        }while (opcion != 3);

    }
        
}
