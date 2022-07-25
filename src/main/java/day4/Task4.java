package day4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int maxSum = 0;
        int maxSumId = 0;
        int[] array = new int[100];

        for (int i = 0; i < array.length; i ++) array[i] = random.nextInt(10000);

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if ( sum > maxSum) {
                maxSum = sum;
                maxSumId = i ;
            }
        }
        System.out.println(maxSumId);
        System.out.println(maxSum);
    }
}
