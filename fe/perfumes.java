package fe;

public class perfumes {

    private double price;
    private char Scent;

    @Override
    public String toString() {
        return "perfumes{" + "price=" + price + ", Scent=" + Scent + '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 20 && price >= 180) {

        } else {
            System.out.println("invalid number .");
        }
        this.price = price;
    }

    public char getScent() {

        return Scent;
    }

    public void setScent(char Scent) {
        if (Scent == 'O' || Scent == 'F' || Scent == 'W' || Scent == 'T') {

        } else {
            System.out.println("inavlid char");
        }
        this.Scent = Scent;
    }

    public perfumes(double price, char Scent) {
        this.price = price;
        this.Scent = Scent;
    }

    public perfumes() {
        price = 20;
        Scent = 'O';
    }

    public double getextradiscount() {
        double Discount = 0;
        switch (Scent) {
            case 'O':
            case 'o':
                Discount = price * 5 / 100;
                break;
            case 'F':
            case 'f':
                Discount = price * 10 / 100;
                break;
            case 'W':
            case 'w':
                Discount = price * 15 / 100;
                break;
            case 'T':
            case 't':
                Discount = price * 20 / 100;
                break;
        }
        return Discount;
    }

    public double gettotalprice() {
        double totalprice=getPrice()- getextradiscount();
        return totalprice;
    }
}
