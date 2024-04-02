package ejercicios_semana_santa.vectores;

public class sortear {

    private static boolean itsPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] sortPrimos(int[] vector_main) {
        // Primero, contamos cuántos números primos hay para determinar el tamaño del
        // nuevo vector
        int cuentaPrimos = 0;
        for (int i = 0; i < vector_main.length; i++) {
            if (itsPrime(vector_main[i])) {
                cuentaPrimos++;
            }
        }

        int[] primos = new int[cuentaPrimos];

        // Llenamos el vector de primos
        int indicePrimos = 0;
        for (int i = 0; i < vector_main.length; i++) {
            if (itsPrime(vector_main[i])) {
                primos[indicePrimos++] = vector_main[i];
            }
        }

        return primos; 
    }
}