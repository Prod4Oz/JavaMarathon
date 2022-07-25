package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0; // variable

        while (counter < 5){
            double a = scanner.nextDouble(); // variable
            double b = scanner.nextDouble(); // variable

            counter++;

            if ( b == 0 ) {
                System.out.println("Деление на 0");
                continue;
        }
            System.out.println(a / b);
        }
    }
}
