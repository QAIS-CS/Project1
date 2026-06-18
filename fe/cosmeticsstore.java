package fe;

import java.util.ArrayList;
import java.util.Scanner;

public class cosmeticsstore {

    private int serialnum;
    private ArrayList<Musk> MuskP;

    @Override
    public String toString() {
        return "cosmeticsstore{" + "serialnum=" + serialnum + ", MuskP=" + MuskP + '}';
    }

    public int getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(int serialnum) {
        if (serialnum <= 123 && serialnum >= 123999) {

        } else {
            System.out.println("invakud number ");
        }
        this.serialnum = serialnum;
    }

    public ArrayList<Musk> getMuskP() {
        return MuskP;
    }

    public void setMuskP(ArrayList<Musk> MuskP) {
        this.MuskP = MuskP;
    }

    public cosmeticsstore(int serialnum, ArrayList<Musk> MuskP) {
        this.serialnum = serialnum;
        this.MuskP = MuskP;
    }

    public cosmeticsstore() {
        serialnum = 123456;
    }

    public void addmusk(int id, String name, double price, char scent) {
        Musk m = new Musk(id, name, price, scent);
        MuskP.add(m);

    }

    public void addmusk() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter id : ");
        int id = s.nextInt();
        System.out.println("enter name : ");
        String name = s.next();
        System.out.println("enter price : ");
        double price = s.nextDouble();
        System.out.println("enter scent : ");
        char scent = s.next().charAt(0);
        addmusk(id, name, price, scent);
    }
}
