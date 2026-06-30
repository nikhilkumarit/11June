public class Phone {
    private String brand;
    private double price;
    private int battery;
    
    Phone(String brand, double price, int battery){
        this.brand = brand;
        this.price = price;
        this.battery = battery;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }
    public int getBatteryLevel(){
        return battery;
    }
    public void display(){
        System.out.println("\nBrand : "+brand);
        System.out.println("Price : "+price);
        System.out.println("BatteryLevel : "+battery);
        System.out.println();
    }
    public void setBatterlevel(int battery){
        if(battery >= 0 && battery <= 100){
            this.battery = battery;
        }
        else{
            System.out.println("Batterlevel is not vaild.");
        }
    }
    public static void main(String[] args) {
        Phone p1 = new Phone("Apple",150000,99);
        p1.display();
        p1.setBatterlevel(100);
        p1.display();
    }
}