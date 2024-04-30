/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresgrupocr;

import java.util.Scanner;

/**
 *
 * @author Virtutienda
 */
public class VectoresGrupoCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int[] vec1={2,3,4};
        Scanner tec = new Scanner(System.in);
        System.out.println("Type Dimension");
        int dim = tec.nextInt();
        int[] vec = new int[dim];
        String[] vec1 = new String[dim];
        methvec meth = new methvec();
        meth.fill(vec, vec1);
        meth.print(vec, vec1);
         System.out.println("Type Num: ");
         int bus = tec.nextInt();
         int[] rtacopy = new int[2];
         rtacopy = meth.search(vec, bus);
         
         
         if(rtacopy[1] == 12){
            System.out.println("the num was found");
             System.out.println(""+rtacopy[0]);
        }else{
           System.out.println("the num not was found"); 
        }
         
         
        tec.nextLine();
        System.out.println("Type Name: ");
        String busname = tec.nextLine();
        boolean desiname = meth.searchname(vec1, busname);
        
        if(desiname == true){
            System.out.println("the name was found");
        }else{
           System.out.println("the name not was found"); 
        }
    }

}
