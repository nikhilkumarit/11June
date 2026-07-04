class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    String getBrand() {
        return brand;
    }

    int getSpeed() {
        return speed;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}

class Bike extends Vehicle {
    private String type;

    Bike(String brand, int speed, String type) {
        super(brand, speed);
        this.type = type;
    }

    void display() {
        super.display();
        System.out.println("Type : " + type);
    }
}

public class InnerVehicle {
    public static void main(String[] args) {
        Bike b1 = new Bike("Yamaha", 299, "Sports");
        b1.display();
    }

}