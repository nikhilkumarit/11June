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
    
}