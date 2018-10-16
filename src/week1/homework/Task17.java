package week1.homework;
/*Написать программу вычисления идеального веса пользователя (рост-100).
Выдать рекомендации о необходимости поправиться либо похудеть.*/

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height");
        int height = sc.nextInt();
        System.out.println("Enter your weight");
        int weight = sc.nextInt();

        int idealWeight = (height - 100);
        System.out.println(idealWeight);
        if (weight > idealWeight) {
            System.out.println("You need to loose weight");
        } else if (weight == idealWeight) {
            System.out.println("Your weight is ideal");
        } else if (weight < idealWeight) {
            System.out.println("You need to gain weight");
        }


    }
}
