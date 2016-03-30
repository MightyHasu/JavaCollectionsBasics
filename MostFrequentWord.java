import java.util.*;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().toLowerCase().split("[^a-zA-Z]+");
        Map<String, Integer> wordsCount = new TreeMap<String, Integer>();
        int maxCount = 0;
        for (int i = 0; i <arr.length ; i++) {
            Integer count = wordsCount.get(arr[i]);
            if (count == null) {
                count = 0;
            }
            if (count + 1 > maxCount) {
                maxCount = count + 1;
            }
            wordsCount.put(arr[i], count + 1);
        }
        for (Map.Entry<String, Integer> max : wordsCount.entrySet()) {
            if (max.getValue() == maxCount) {
                System.out.printf("%s -> %d times\n", max.getKey(),
                        max.getValue());
            }
        }
        }
    }

