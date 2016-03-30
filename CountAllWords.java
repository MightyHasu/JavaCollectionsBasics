import java.util.Scanner;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] words = sc.nextLine().split("[^a-zA-Z]+");
        int wordsCount = words.length;
        System.out.println(wordsCount);
    }
}
