package week2.HomeWork;
/*Поміняти місцями найбільший і найменший елемент в масиві*/

import week2.ClassWork.ArrayUtils;

public class Task3 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 15);
        ArrayUtils.printArray(array);

        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {

            int element = array[i];
            if (element > max) {
                max = element;
                indexMax = i;
            }
            if (element < min) {
                min = element;
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;

        ArrayUtils.printArray(array);
    }
}
