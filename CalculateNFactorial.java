import java.util.Scanner;

/**
 * Created by Mighty on 30.3.2016 г..
 */
public class CalculateNFactorial {
    public static int factorial(int N) {
        if (N == 1) return 1;
        return N * factorial(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
}
