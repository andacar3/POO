package quiz2.fill;

import quiz2.main.main;
import java.util.Scanner;

public class llenar {

    public void fill(int[] numbers,int cantidad) {
        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("ingrese un numero");
            int nVec = tec.nextInt();
            while ( nVec > 999 ||nVec < -999) {
                System.out.println("Numero no valido, ingrese un numero de 3 cifras");
                nVec = tec.nextInt();
                
            }
            numbers[i] = nVec;
            
            
        }
        main meth = new main();
        meth.menu(numbers, cantidad);
    }
    
}
