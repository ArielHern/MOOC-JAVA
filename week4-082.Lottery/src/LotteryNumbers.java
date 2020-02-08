
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            int randNum = rand.nextInt(39) + 1;
            if (!containsNumber(randNum)) {
                this.numbers.add(randNum);

            } else {
                i--;
            }

        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int num : this.numbers) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
