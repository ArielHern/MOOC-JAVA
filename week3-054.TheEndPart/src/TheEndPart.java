
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the end part: ");
        int endpart = Integer.parseInt(reader.nextLine());
        int totalLength = word.length();
        System.out.print("Result: "+word.substring(totalLength - endpart));

    }
}
