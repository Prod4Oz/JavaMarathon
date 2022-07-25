package day7;

public class Airplane {
    private String manufacturer;
    private int year, length,  weight, fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info() {
        System.out.println(
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel
        );
    }
    public void fillUp (int input){
        fuel += input;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirPlanes (Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() > airplane2.getLength()){
            System.out.println("airplane1");
        }else {
            System.out.println("airplane2");
        }
    }
}
