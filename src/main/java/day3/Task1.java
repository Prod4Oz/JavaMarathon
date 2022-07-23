package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;

            switch (city){
                case "Москва":
                    System.out.println("Россия");
                    break;
                case "Милан" :
                    System.out.println("Италия");
                    break;
                case "Лондон" :
                    System.out.println("Англия");
                    break;
                case "Мюнхен" :
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
