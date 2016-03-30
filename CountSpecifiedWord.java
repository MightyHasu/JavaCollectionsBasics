import java.util.Scanner;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] words = sc.nextLine().split("[^a-zA-Z]+");
        String key = sc.nextLine();
        int wordsCount = 0;
        for (int i = 0; i <words.length ; i++) {
            if (key.toLowerCase().equals(words[i].toLowerCase())) {
                wordsCount++;
            }
        }

        System.out.println(wordsCount);
    }
}
