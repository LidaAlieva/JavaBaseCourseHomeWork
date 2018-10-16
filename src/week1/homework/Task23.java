package week1.homework;
/*Известны площади круга и квадрата. Определить:
	а) уместится ли круг в квадрат;
	б) уместится ли квадрат в круге.*/

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a area of a circle");
        int areaOfaCircle = sc.nextInt();
        System.out.println("Enter a area of a square");
        int areaOfaSquare = sc.nextInt();

        if (areaOfaCircle <= areaOfaSquare) {
            System.out.println("Circle fit in square");
        } else {
            System.out.println("Circle not fit in square");
        }
    }

}
