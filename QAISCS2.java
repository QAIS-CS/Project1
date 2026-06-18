

package qais.cs.pkg2;

import java.util.Scanner;


public class QAISCS2 {

    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("enter number of values : ");
         int s=in.nextInt();
         int numbers[]=new int[s];
         for(int i=0;i<numbers.length;i++){
             System.out.println("enter numbers "+i+":");
             numbers[i]=in.nextInt();
         }
        System.out.println("=======================================");
        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(i+"  -  "+numbers[i]);
        }
    System.out.println("=======================================");
        for(int i=0;i<numbers.length;i++){
            System.out.println(i+"  -  "+numbers[i]);
        }
    
    }
    
    
    
}
