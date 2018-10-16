package week1.homework;
/*Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям предоставляется 20% скидка.
Ввести продолжительность разговора и день недели (цифра от 1 до 7).*/

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a call duration, min");
        int callDuration = sc.nextInt();
        System.out.println("Enter a day of week (1-7)");
        int dayOfWeek = sc.nextInt();

        int valueOfMin = callDuration * 5; // 5 - стоимость одной мин

        if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println(valueOfMin * 0.8);
        } else {
            System.out.println(valueOfMin);
        }

    }
}
