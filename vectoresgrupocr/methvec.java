/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectoresgrupocr;

import java.util.Scanner;

/**
 *
 * @author Virtutienda
 */
public class methvec {

    public int[] search(int vec[],int bus){
       int i,pol,lo;
       int[] vecrta=new int[2];
        for(i=0;i<vec.length;i++){
          if(vec[i] == bus){
              pol=55;
              lo =12;
              vecrta[0]=pol;
              vecrta[1]=lo;
              return vecrta;//si esta
           
          }
       }
              vecrta[0]=0;
              vecrta[1]=0;
        return vecrta;
    }  
    
    public boolean searchname(String[] vec1, String busname){
       int i;
        for(i=0;i<vec1.length;i++){
          if(vec1[i].equalsIgnoreCase(busname)){
            return true;
          }
       }
        return false;
    } 
    
    
    
    public void print(int vec[], String vec1[]){
         int i;
        //print
        for (i = 0; i < vec.length; i++) {
            System.out.print("[" + vec[i] + "]");
            
        }
        
         for (i = 0; i < vec1.length; i++) {
             System.out.print("[" + vec1[i] + "]");
        }
    }
    
    
    public void fill(int vec[], String vec1[]) {
        int i, num;
        String name;
        Scanner tec = new Scanner(System.in);
        //fill
        for (i = 0; i < vec.length; i++) {
            System.out.println("Type number: ");
            num = tec.nextInt();
            vec[i] = num;
        }

        for (i = 0; i < vec1.length; i++) {
            tec.nextLine();
            System.out.println("Type name: ");
            name = tec.nextLine();
            vec1[i] = name;
            
        }
    }
}
