import java.util.Scanner;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int maxlenght = 1;
        int counter = 1;
        String result = null;
        for (int i = 0; i <input.length-1 ; i++) {
            if (input[i].equals(input[i+1]))
            {
                counter++;
                if (counter>maxlenght)
                {
                    maxlenght = counter;
                    result = input[i];
                }

            }

            else
            {
                counter = 1;
            }
        }
        for (int i = 0; i <counter ; i++) {
            System.out.print(result+" ");
        }
        System.out.println();
    }
}
