
package qais.pkg2;

public class Test2smartphone {
    public static void main(String[] args) {
        SMARTPHONE2 s=new SMARTPHONE2("Apple",32);
        System.out.println(s.toString());
        System.out.println("before:"+s.getStorage());
       s.UpgradeStorage(32);
        System.out.println("after:"+s.getStorage());
    }
    }

