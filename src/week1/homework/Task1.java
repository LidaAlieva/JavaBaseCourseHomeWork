package week1.homework;
/*Пользователь вводит параметр с консоли (текущий час от 0 до 24).
Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it now?");
        int hour = sc.nextInt();
        System.out.println("Hour" + hour);
        if (hour >= 9 && hour <= 18) {
            System.out.println("I`m at work");
        } else {
            System.out.println("I`m resting");
        }
    }
}


