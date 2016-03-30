import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mighty on 29.3.2016 г..
 */
public interface CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstIn = sc.nextLine().split(" ");
        String[] secondIn = sc.nextLine().split(" ");
        ArrayList<Character> firstList = new ArrayList<>();
        for (int i = 0; i <firstIn.length ; i++) {
            firstList.add(firstIn[i].charAt(0));
        }
        ArrayList<Character> secondList = new ArrayList<>();
        for (int i = 0; i <secondIn.length ; i++) {
            if (!firstList.contains(secondIn[i].charAt(0))){
                secondList.add(secondIn[i].charAt(0));
            }
        }
        for (int i = 0; i <secondList.size() ; i++) {
            firstList.add(secondList.get(i));
        }
        for (int i = 0; i <firstList.size() ; i++) {
            System.out.print(firstList.get(i)+" ");
        }
        System.out.println();
    }
}
