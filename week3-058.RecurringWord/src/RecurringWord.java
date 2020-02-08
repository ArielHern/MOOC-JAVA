
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String wordIn = reader.nextLine();

            if (words.contains(wordIn)) {
                System.out.println("You gave the word "+wordIn+" twice");
                break;
            }
            words.add(wordIn);
            
        }

    }
}
