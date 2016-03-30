import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Mighty on 30.3.2016 г..
 */
public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> cards = new HashMap<String, Integer>();
        String [] in = sc.nextLine().split("[^a-zA-Z0-9]+");
        int maxCount = 0;
        for (int i = 0; i <in.length ; i++) {
            Integer count = cards.get(in[i]);
            if (count == null) {
                count = 0;
            }
            if (count + 1 > maxCount) {
                maxCount = count + 1;
            }
            cards.put(in[i], count + 1);
        }
        for (Map.Entry<String, Integer> max : cards.entrySet()) {
                System.out.printf("%s -> %.2f%s   \n", max.getKey(),
                        (((double)max.getValue()/in.length)*100), "%");

        }
    }
}
