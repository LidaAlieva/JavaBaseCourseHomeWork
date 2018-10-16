package week2.HomeWork;
/*Дано два масиви однакової довжини arr1 i arr2. Вивести в консоль значення масиву, який отримаємо в результаті arr1[i] + arr2[i]*/

import week2.ClassWork.ArrayUtils;

public class Task9 {
    public static void main(String[] args){
        int[] arr1 = ArrayUtils.generateArray(5,5);
        int[] arr2 = ArrayUtils.generateArray(5,5);
        ArrayUtils.printArray(arr1);
        ArrayUtils.printArray(arr2);

        int[] arr3 = new int[5];

        for(int i = 0; i < arr1.length; i++){
             arr3 [i] = arr1[i] + arr2[i];
        }
        ArrayUtils.printArray(arr3);

    }
}
