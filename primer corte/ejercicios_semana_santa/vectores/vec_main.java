package ejercicios_semana_santa.vectores;
import java.util.Scanner;
/**
 * vec_main
 */
public class vec_main {
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.println("Ingrese el número de elementos del vector:");
    int numElementos = tec.nextInt();

    int[] vector_main = new int[numElementos];
    rellenar.fill(vector_main, tec);
    int[] primos = sortear.sortPrimos(vector_main);
    imprimir.printer(vector_main, primos);

}
    
}