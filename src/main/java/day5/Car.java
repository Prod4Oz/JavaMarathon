package day5;

public class Car {
    private int year;
    private String color, model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public Car(){}

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
