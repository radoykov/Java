import java.util.*;

public class PlayerA extends Base {
    //    private Set<Integer> solutions = new HashSet<>();
    ArrayList<Integer> solutions = new ArrayList<Integer>();
    private int previousGuess;

    public int initialGuess() {
        initSolutions();    //creating the array
        int index = super.generateRandomNumber(solutions.size()) - 1; //get random index out of solutions
        previousGuess = solutions.remove(index);

        return previousGuess;
    }

    //Random method
    public int guessA(CowsAndBullsResult animalsObj) {
        if (solutions.isEmpty()) return 0;
        reduceSolution(animalsObj);

        // Returning the random number
        previousGuess = solutions.remove(super.generateRandomNumber(solutions.size()) - 1);
        return previousGuess;
    }

    //Heuristic method
    public int guessB(CowsAndBullsResult animalsObj) {
        if (solutions.isEmpty()) return 0;
        reduceSolution(animalsObj);

        // Count digit frequencies
        int[] freq = new int[10];
        for (int num : solutions) {
            int[] digits = getDigits(num);
            for (int d : digits) freq[d]++;
        }

        // Find number with minimum digit frequency sum
        int bestNum = -1;
        int bestScore = Integer.MAX_VALUE; //Min is the best score

        for (int num : solutions) {
            int[] digits = getDigits(num);
            int score = 0;
            for (int d : digits) score += freq[d];

            if (score < bestScore) {
                bestScore = score;
                bestNum = num;
            }
        }

        // Remove and return the chosen number
        previousGuess = solutions.remove(solutions.indexOf(bestNum));
        return previousGuess;
    }

    //Knuth-style minimax approach
    public int guessC(CowsAndBullsResult animalsObj) {
        if (solutions.isEmpty()) return 0;

        reduceSolution(animalsObj);

        if (solutions.size() == 1) {
            previousGuess = solutions.removeFirst();
            return previousGuess;
        }
        ;

        int bestGuess = -1;
        double bestExpected = Double.MAX_VALUE;

        for (int guess : solutions) {
            // Map feedback -> count of candidates that would yield that feedback
            Map<String, Integer> feedbackCounts = new HashMap<>();

            for (int candidate : solutions) {
                CowsAndBullsResult r = PlayerB.getCawsAndBulls(candidate, guess);
                String key = r.getBulls() + "," + r.getCows(); // unique key for feedback type
                feedbackCounts.merge(key, 1, Integer::sum);
            }

            // Compute expected remaining set size
            double expected = 0.0;
            for (int count : feedbackCounts.values()) {
                expected += (count * count);
            }
            expected /= solutions.size();

            if (expected < bestExpected) {
                bestExpected = expected;
                bestGuess = guess;
            }
        }

        previousGuess = solutions.remove(solutions.indexOf(bestGuess));
        return previousGuess;
    }

    private int[] getDigits(int num) {
        return new int[]{
                num / 1000,
                (num / 100) % 10,
                (num / 10) % 10,
                num % 10
        };
    }

    private void initSolutions() {
        for (int num = 1234; num <= 9876; num++) {
            int a = num / 1000;
            int b = (num / 100) % 10;
            int c = (num / 10) % 10;
            int d = num % 10;

            // Check for 0 and uniqueness
            if (a != 0 && b != 0 && c != 0 && d != 0 &&
                    a != b && a != c && a != d &&
                    b != c && b != d &&
                    c != d) {
                solutions.add(num);
            }
        }
    }

    public void resetGame() {
        solutions.clear();
        initSolutions();
    }

    private void reduceSolution(CowsAndBullsResult animalsObj) {
        //Reducing the array
        PlayerB b = new PlayerB();
        solutions.removeIf(num ->
                !animalsObj.equals(PlayerB.getCawsAndBulls(num, previousGuess))
        );
    }
}
//example
//1234 1k 1b
//3974 2k
//4839 1k 1b
//8423 1k
//5687 1k
//1678 2k
//1648 2k
//7258 00
//6134 1k 2b
//=> 9136 4b