
package qais;
import java.util.Scanner;
public class QAIS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("read 3 integers number");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
      if(n1>=n2 && n1>=n3)
         System.out.println("maximum " +n1);
      else if(n2>=n1 && n2>=n3)
         System.out.println("maximum " +n2);
      else 
         System.out.println("maximum " +n3);

  
        // TODO code application logic here
    }
    
}
