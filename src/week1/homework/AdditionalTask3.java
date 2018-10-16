package week1.homework;
/*Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер*/

import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int counter = 0;
        while (number > 8) {
            if (number % 10 == 8) {
                counter++;
            }
            number /= 10;
        }
        System.out.println(counter);
    }

}
