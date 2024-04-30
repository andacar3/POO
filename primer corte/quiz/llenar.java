package quiz;

import java.util.Scanner;

/**
 * llenar
 */
public class llenar {

    public void  fill(int[] cedula, int[] edad) {
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < edad.length; i++) {
            System.out.println("ingrese su edad");
            int age = tec.nextInt();
            while (age < 1 && age > 100) {
                System.out.println("edad no valida, ingrese su edad nuevamente");
                age = tec.nextInt();
            }
            edad[i] = age;
            System.out.println("ingrese su cedula");
            int id = tec.nextInt();
        for (int j = 0; j < cedula.length; j++) {
            while (cedula[j] == id) {
                System.out.println("cedula repetida, ingrese una cedula diferente");
                id = tec.nextInt();
                
            }
            
        }

        }
        
    }

    
}