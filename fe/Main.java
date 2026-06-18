package fe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cosmeticsstore s1=new cosmeticsstore();
        cosmeticsstore s2=new cosmeticsstore();

    }public static void fill(cosmeticsstore store) {
        Scanner s=new Scanner(System.in);
            System.out.println(" enter serialnum");
            store.setSerialnum(s.nextInt());
            System.out.println("enter count ");
            int count=s.nextInt();
            for(int i=0;1<count;i++)
                store.addmusk();
        
    }
   
}
