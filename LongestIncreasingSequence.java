import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public class LongestIncreasingSequence {
    public static int[] longestSequence (int [] arr){
        int maxlenght = 0;
        int counter = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i]<arr[i+1])
            {
                counter++;
                if (counter>maxlenght)
                {
                    maxlenght = counter;
                    start = i+1-counter;
                    end = i+1;
                }

            }

            else
            {
                counter = 0;
            }

        }
        int[] longest = new int[maxlenght+1];

        for (int i = start,j =0; i <=end; i++,j++)
        {
            longest[j]=arr[i];
        }
        return longest;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] in = sc.nextLine().split(" ");
        int [] arr = new int[in.length];
        for (int i = 0; i <in.length ; i++) {
            arr[i]=Integer.parseInt(in[i]);
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] < arr[i+1]) {
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.println(arr[i]);
                System.out.println();
            }
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
        int longest[] = longestSequence(arr);
        System.out.print("Longest: ");
        for (int i = 0; i <longest.length ; i++) {
            System.out.print(longest[i]+" ");
        }
        System.out.println();
    }
}
