package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure [] figures = {
                new Triangle(9,9,9,"Black"),
                new Triangle(5,7,9,"Red"),
                new Triangle(5,8,4,"Red"),
                new Rectangle("Gray", 45,15),
                new Rectangle("Red", 12,45),
                new Circle(7,"White"),
                new Circle(21,"Red")
        };
        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter ( Figure [] figures){
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();
        }
        return  sum;
    }
    public static double calculateRedArea ( Figure [] figures){
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();
        }
        return  sum;
    }
}
