package quiz2.search;

import quiz2.main.main;

public class search {

    public void look(int[] numbers, int cantidad) {
        int totalPrimos = 0;

        // Iterate over each number in the array to check if it's prime
        for (int num : numbers) {
            if (isPrime(num)) {
                totalPrimos++;
            }
        }

        // Print the total number of prime numbers found
        System.out.println("El total de numeros primos es: " + totalPrimos);

        // Re-invoke the menu method to allow further actions
        main meth = new main();
        meth.menu(numbers, cantidad);
    }

    // Helper method to determine if a number is prime
    private boolean isPrime(int num) {
        // Check for edge cases
        if (num <= 1) return false;
        // Only check for factors up to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}