package week2.HomeWork;
/*Знайти мінімальне і максимальне значення в масиві, вивести їх в консоль.*/

import week2.ClassWork.ArrayUtils;

public class Task2 {
    public static void main(String[] args){
        int[] array = ArrayUtils.generateArray(10, 15);
        ArrayUtils.printArray(array);

        int max = array[0];
        int min = array[0];
        int indexMax;
        int indexMin;

        for (int i = 0; i < array.length; i++){
            int element = array[i];
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println(max);
        System.out.println(min);



    }

}
