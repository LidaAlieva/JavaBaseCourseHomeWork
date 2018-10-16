package week1.homework;
/*Написать программу, которая в зависимости от характера ветра выдает сообщение о его скорости от 1до 4 м/с - слабый (1);
от 5-10 м/c - умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4)
 */

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a speed of wind, m/s");
        int speedOfWind = sc.nextInt();

        if (speedOfWind >= 1 && speedOfWind <= 4) {
            System.out.println("Small");
        } else if (speedOfWind >= 5 && speedOfWind <= 10) {
            System.out.println("Medium");
        } else if (speedOfWind >= 9 && speedOfWind <= 18) {
            System.out.println("Strong");
        } else if (speedOfWind > 19) {
            System.out.println("Hurricane");
        }
    }
}
