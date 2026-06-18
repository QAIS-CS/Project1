
package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
static Scanner in=new Scanner(System.in);
    
    public static void main(String[] args) {
       //way1
        String z=done();
        System.out.println("height="+z);
        //way2
        System.out.println("height="+done());
       
    }
    public static String done(){
        double h,total=0;
        String s="";
        for(int i=1;i<=6;i++){
            System.out.println("read height for tree="+i);
            h=in.nextDouble();
            total=total+h;
        }
    System.out.println("total height="+total);
    if(total<100)
        s= "low height";
    else if(total>=100 && total<=500)
        s= "normal height";
    else if(total>500)
        s= "over height";
    return s;
  }
}