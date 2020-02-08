
import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 10, 11);

        Collections.addAll(list2, 5,11);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void smartCombine(ArrayList<Integer> lst1, ArrayList<Integer> lst2) {

        for (int num : lst2) {
            if (!lst1.contains(num)) {
                lst1.add(num);
            }
        }

    }

}
