package week1.homework;
/*Вычислить факториал числа*/

public class AdditionalTask2 {
    static int calculateFactorial(int n){
        int result = 1;       // факториал числа n — это произведение всех натуральных чисел от 1 до n включительно.
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }

}
