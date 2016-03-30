import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().toLowerCase().split("[^a-zA-Z]+");
        List<String> list = Arrays.asList(arr);
        Collections.sort(list);
        list = new ArrayList<String>(new LinkedHashSet<String>(list));
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
