public class PlayerB extends Base {
    private int secret;

    public PlayerB() {
        secret = super.generateUniqueNumber();
    }

    public CowsAndBullsResult getCawsAndBulls(int guess) {
        CowsAndBullsResult result = new CowsAndBullsResult();
        String guessStr = String.valueOf(guess);
        String secretStr = String.valueOf(secret);

        for (int i = 0; i < 4; i++) {
            if (secretStr.charAt(i) == guessStr.charAt(i)) result.addBull();
            else if (secretStr.indexOf(guessStr.charAt(i)) != -1) result.addCow();
        }
        return result;
    }

    //overload
    public static CowsAndBullsResult getCawsAndBulls(int guess, int secret) {
        CowsAndBullsResult result = new CowsAndBullsResult();
        String guessStr = String.valueOf(guess);
        String secretStr = String.valueOf(secret);

        for (int i = 0; i < 4; i++) {
            if (secretStr.charAt(i) == guessStr.charAt(i)) result.addBull();
            else if (secretStr.indexOf(guessStr.charAt(i)) != -1) result.addCow();
        }
        return result;
    }

    public void regenerateTheNumber() {
        secret = super.generateUniqueNumber();
    }
}