package hola;

import java.util.Scanner;

public class entreno {


    public void llenar(int[] cultivo, Scanner tec) {
        for(int i = 0; i < cultivo.length; i++) {
            if(i % 2 == 0) {
                System.out.println(" Digite naranjas para jugo");
                cultivo[i] = tec.nextInt();
            }else{
                System.out.println("Digite naranjas para comer");
                cultivo[i] = tec.nextInt();
            }
        }

    }

    public void imprimir(int[] cultivo) {
        int parcelaCont = 1;
        for(int i = 0; i < cultivo.length; i++) {
            if (i % 2 != 0) {
                System.out.println("la parcela numero "+ parcelaCont+" tiene: \n");
                System.out.println("Tiene "+cultivo[i]+" naranjas para comer");
                System.out.println("Tiene "+cultivo[i - 1]+" naranjas para jugo \n");
                parcelaCont++;
            }else{
                continue;
            }

        }

    }

    public void modificar(int[] cultivo, Scanner tec) {
        if (cultivo.length == 0) {
            System.out.println("No hay parcelas disponibles para modificar.");
            return;
        }
    
        System.out.println("Ingrese el número de la parcela que desea modificar:");
        int numParcela = tec.nextInt();

        while (numParcela < 1 || numParcela > cultivo.length / 2) {
            System.out.println("Número de parcela inválido. Intente de nuevo:");
            numParcela = tec.nextInt();
        }
    
        int indexJugo = (numParcela - 1) * 2;
        int indexComer = indexJugo + 1;
    
        System.out.println("Digite la nueva cantidad de naranjas para jugo para la parcela " + numParcela + ":");
        cultivo[indexJugo] = tec.nextInt();
    
        System.out.println("Digite la nueva cantidad de naranjas para comer para la parcela " + numParcela + ":");
        cultivo[indexComer] = tec.nextInt();
    
        System.out.println("Parcela " + numParcela + " modificada correctamente.");
    }


    public void buscar(int[] cultivo, Scanner tec) {
        int parcelaCont = 1;
        for(int i = 0; i < cultivo.length; i++) {
            if (i % 2 != 0) {
                if (cultivo[i] == 0 && cultivo [i - 1] == 0) {
                    System.out.println("la parcela "+parcelaCont+" no produjo nada este año");
                }
                parcelaCont++;
            }else{
                continue;
            }
        }
        
    }
        
    





    public void menu() {
        System.out.println("Bienvenido al menu");
        System.out.println(" Elige una opcion ♠");
        System.out.println(" 1. Llenar parcela");
        System.out.println(" 2. Imprimir parcela");
        System.out.println(" 3. Modificar parcela");
        System.out.println(" 4. Parcela vacia");
        System.out.println(" 5. Salir");


    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcion = 0;
        entreno lo = new entreno();
        int nparcelas = 0;

        System.out.println("De cuantos parcelas sera su vector");
        nparcelas = tec.nextInt();
        nparcelas = nparcelas * 2;

        int[] cultivo = new int[nparcelas];

        do {

            lo.menu();
            opcion = tec.nextInt();
            switch (opcion) {
                case 1:
                lo.llenar(cultivo, tec);
                    break;
                case 2:
                    lo.imprimir(cultivo);
                    break;
                case 3:
                    lo.modificar(cultivo, tec);
                    break;
                case 4:
                    lo.buscar(cultivo, tec);
                    break;
                default:
                    break;
            }
        } while(opcion != 5);


    }
}