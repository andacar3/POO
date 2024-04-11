package quiz2.search;

import quiz2.main.main;

public class search {

    public void look(int[] numbers,int cantidad) {
        int num = 0;
        int totalPrimos = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = num;
        for (int j = 1; j < num; j++) {
            if (num % j == 0) {
                count = count + 1;
            }
            else{
                break;
            }
            
            if (count > 2) {
                continue;
            }else{
                totalPrimos = totalPrimos + 1;
            }
        }
      
        
        }
        System.out.println("El total de numeros primos es: ");
        System.out.println(totalPrimos);
        main meth = new main();
        meth.menu(numbers, cantidad);
    }
    
}
