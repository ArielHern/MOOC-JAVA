
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int pl = 0;
        if (name.length() > 3) {
            for (int i = 1; i <= 3; i++) {                
                System.out.println(i + ". character: "+name.charAt(pl));
                pl++;
            }

        }
    }
}
