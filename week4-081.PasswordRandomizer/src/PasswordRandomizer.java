
import java.util.Random;

public class PasswordRandomizer {

    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int passLength = this.length;
        Random random = new Random();
        String pass = "";
        while (passLength > 0) {            
            int randNum = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randNum);
            pass += symbol;
            passLength--;
        }

        return pass;
    }
}
