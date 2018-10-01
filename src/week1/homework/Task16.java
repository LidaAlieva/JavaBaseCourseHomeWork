package week1.homework;
/*Вирахувати вартість покупки з урахуванням знижки. Знижка в 10% надається, якщо сума покупки перевищує 1000 грн.*/

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a purchase amount");
        int purchase = sc.nextInt();

        if (purchase >= 1000) {
            System.out.println(purchase * 0.9);
        } else {
            System.out.println(purchase);

        }
    }
}
