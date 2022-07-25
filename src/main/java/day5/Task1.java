package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(); // create a class object CAR
        car.setColor("Black");
        car.setYear(2000);
        car.setModel("Audi");
        System.out.println( "Uor car: " + car.getColor()+car.getModel()+car.getYear());
    }
}
