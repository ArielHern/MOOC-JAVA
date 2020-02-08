
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int st = 1;
        int counter =0;
        while(counter < name.length()){
            System.out.println(st+". character: "+name.charAt(counter));
            counter++;
            st++;
        }
    }
}
