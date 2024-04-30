package ejercicios_semana_santa.vectores;

import java.util.Scanner;

public class rellenar {

    public static void fill(int[] vector_main, Scanner tec){
        for (int i = 0; i < vector_main.length; i++) {
            System.out.println("Ingrese el valor para el elemento " + (i + 1) + ":");
            vector_main[i] = tec.nextInt();
    }

    
}
}
