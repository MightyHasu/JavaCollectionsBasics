import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        int [] arr = new int[length];
        String[] numbers = sc.nextLine().split(" ");
        for (int i = 0; i <numbers.length ; i++) {
            arr[i]=Integer.parseInt(numbers[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
