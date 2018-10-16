package week2.HomeWork;
/*Створити 2 масиви з випадковими числами від 25 до 75. Визначити, в якого з них більше парних елементів.*/

import week2.ClassWork.ArrayUtils;

public class Task10 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.generateArrayFrom25To75(10, 25, 75);
        ArrayUtils.printArray(arr1);
        int[] arr2 = ArrayUtils.generateArrayFrom25To75(10, 25, 75);
        ArrayUtils.printArray(arr2);

        int doublesElement1 = 0;
        int doublesElement2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                doublesElement1++;
            }

        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                doublesElement2++;
            }
        }

        if (doublesElement1 > doublesElement2) {
            System.out.println("Array 1 have more paired elements");
        } else if (doublesElement2 > doublesElement1) {
            System.out.println("Array 2 have more paired elements");
        }
    }
}

