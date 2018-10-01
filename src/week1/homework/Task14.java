package week1.homework;

/*Дано швидкість та час. Визначити, за який час ви прибудете в пункт призначення.*/

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter speed");
        double speed = sc.nextDouble();
        System.out.println("Enter distance");
        double distance = sc.nextDouble();

        System.out.println(distance / speed);


    }
}
