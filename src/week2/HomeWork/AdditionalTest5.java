package week2.HomeWork;
/*Здвинути масив на задану кількість позицій. Наприклад:
	{1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}.*/

import week2.ClassWork.ArrayUtils;

import java.util.Scanner;

public class AdditionalTest5 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.generateArray(5, 10);
        ArrayUtils.printArray(arr1);
        int[] arr2 = new int[arr1.length];
        int last = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position");
        int position = sc.nextInt();


        for (int i = 0; i < arr1.length + position; i++) {
            if (i + position < arr1.length) {
                arr2[i + position] = arr1[i];
            } else {
                arr2[last] = arr1[arr1.length - position];
                last++;
                position--;
            }


        }
        ArrayUtils.printArray(arr2);
    }
}
