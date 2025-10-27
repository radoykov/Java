import java.util.Random;

public class Base {

    protected int generateRandomNumber(int bound) {
        Random rand = new Random();
        return (1 + rand.nextInt(bound));
    }

    protected int generateUniqueNumber() {
        boolean[] used = new boolean[10];
        int number = 0;
        int digitsGenerated = 0;

        while (digitsGenerated < 4) {
            int digit = generateRandomNumber(9);

            if (!used[digit]) {
                used[digit] = true;
                number = number * 10 + digit;
                digitsGenerated++;
            }
        }
        return number;
    }
}
