package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW", " White", 2020);

        System.out.println( motorbike.getModel() + motorbike.getColor()+motorbike.getYear());
    }
}
