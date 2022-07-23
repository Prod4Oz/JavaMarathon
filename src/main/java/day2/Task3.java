package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int t = a + 1;
        if (a < b && b != 0) {
            while (t < b) {
                if (t % 5 == 0 && t % 10 != 0) System.out.print(t + " ");
                t++;
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
