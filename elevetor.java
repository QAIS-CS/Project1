package mid.oop.pkg1;

public class elevetor {

    private char speed;
    private int floors;

    @Override
    public String toString() {
        return "elevetor{" + "speed=" + speed + ", floors=" + floors + '}';
    }

    public char getSpeed() {
        char speed = 0;
        if (speed == 'F' && speed == 'S') {

        } else {
            System.out.println("invalid number");
        }
        return speed;
    }

    public void setSpeed(char speed) {

        this.speed = speed;

    }

    public int getFloors() {
        int floors = 0;
        if (floors >= 1 && floors <= 20) {
        } else {
            System.out.println("invalid number");
        }
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public elevetor(char speed, int floors) {
        this.speed = speed;
        this.floors = floors;
    }

    public elevetor() {
        floors = '4';
        speed = 'F';
    }

    public double getspeedcost() {
        int speedcost = 0;
        if (speed == 'F') {
            speedcost = 3000;
        }
        if (speed == 'S') {
            speedcost = 1500;
        }
        return speedcost;

    }

    public double getfloorscost() {
        int floorscost = 0;
        if (floors >= 1 && floors <= 5) {
            floorscost = floors * 2000;

        }
        if (floors >= 6 && floors <= 10) {
            floorscost = floors * 1500;

        }
        if (floors >= 11 && floors <= 20) {
            floorscost = floors * 1000;
        }
        return floorscost;
    }

    public double gettotalcost() {
        double totalcost = getspeedcost() + getfloorscost() + 100;
        return totalcost;
    }

}
