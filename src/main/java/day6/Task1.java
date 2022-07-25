package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2015,"black", "Audi");
        Motorbike motorbike = new Motorbike("BMW", "red", 2020);
       // int yearToDay = 2022;
        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2022));
        System.out.println(motorbike.yearDifference(2022));
    }
}
