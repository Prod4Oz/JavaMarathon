package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("S7", 2020, 5100, 12000);
        airplane.setYear(2018);
        airplane.setLength(5600);
        airplane.fillUp(500);
        airplane.fillUp(100);
        airplane.info();
    }
}
