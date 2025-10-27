public class CowsAndBullsResult {
    private int cows;
    private int bulls;

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    public void addBull() {
        this.bulls++;
    }

    public void addCow() {
        this.cows++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CowsAndBullsResult other = (CowsAndBullsResult) obj;
        return bulls == other.bulls && cows == other.cows;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bulls, cows);
    }
}
