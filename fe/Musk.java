package fe;

public class Musk extends perfumes {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Musk{" + "id=" + id + ", name=" + name + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("white") || name.equals("black")) {

        } else {
            System.out.println("invalid number");
        }
        this.name = name;
    }

    public Musk(int id, String name, double price, char Scent) {
        super(price, Scent);
        this.id = id;
        this.name = name;
    }

    public Musk(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Musk() {
        id = 111;
        name = "white";
    }

    public double gettotalprice() {
        double totalprice = 0;
        switch (name) {
            case "white":
                totalprice = getPrice() - getextradiscount() + 10;
                break;
            case "black":
                totalprice = getPrice() - getextradiscount() + 30;
                break;

        }
        return totalprice;
    }

    public String getmuskinfo() {
        return getId()+"**"+getName()+"**"+ getScent()+"**"+getPrice()+"**"+getextradiscount()+"**"+ gettotalprice();

    }

}
