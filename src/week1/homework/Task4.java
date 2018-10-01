package week1.homework;
/*Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double");
        double newDouble = sc.nextDouble();
        if(newDouble > 0 && newDouble <1) {
            System.out.println("Ok");
        }else if(newDouble <0 && newDouble >1) {
            System.out.println("It`s false");
        }
    }
}
