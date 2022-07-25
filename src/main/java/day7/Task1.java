package day7;
public class Task1 {
    public static void main(String[] args) {
    Airplane airplane1 = new Airplane("S7", 2020, 5100, 12000);
    Airplane airplane2 = new Airplane("S7", 2020, 4000, 12000);
    Airplane.compareAirPlanes(airplane1,airplane2);
    }
}