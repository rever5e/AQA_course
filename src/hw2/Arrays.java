package hw2;
import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        Random rndArr = new Random();
        int maxNum= 100;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndArr.nextInt(maxNum);
                if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
