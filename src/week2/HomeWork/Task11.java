package week2.HomeWork;
/*Написати метод, який буде обрізати масив по заданому початковому та кінцевому індексу.
	public static int[] splitArray(int[] arr, int start, int end)
		{ // обрезать массив по границам start и end
		}*/

public class Task11 {
    public static int[] splitArray(int[] arr, int start, int end) {
        int[] newArray = new int[arr.length - (end - start)];

        int j = 0;

        for (int i = start; i < end; i++) {
            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }
}


