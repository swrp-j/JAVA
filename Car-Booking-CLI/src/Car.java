public class Car {
    int regNum ;
    float price;
    String brand;
    boolean isElectric;
    boolean isBooked = false;



    boolean isAvailable;

    public Car(int regNum, float price, String brand, boolean isElectric) {
        this.regNum = regNum;
        this.price = price;
        this.brand = brand;
        this.isElectric = isElectric;
    }
}
