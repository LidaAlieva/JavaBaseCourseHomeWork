package week2.HomeWork;

public class CoodingBatTest {
    public static void main(String[] args){
        String a = "Hallo";
        String b = "qwerty";

        int max = Math.max(a.length(), b.length());
        String word = "";
        for (int i = 0; i < max; i++) {
            if (i <= a.length()-1)
                word += a.substring(i,i+1);
            if (i <= b.length()-1)
                word += b.substring(i,i+1);
        }
        System.out.println(word);
    }

}
