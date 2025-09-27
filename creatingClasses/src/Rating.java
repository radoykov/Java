import java.util.ArrayList;

class Rating {
    private final ArrayList<Double> grades;
    private double avg;
    private double sum;
    private int count;

    public Rating() {
        grades = new ArrayList<Double>();
        setCount(0);
        setSum(0);
        setAvg(0);
    }

    public Rating(double[] arr) {
        grades = new ArrayList<Double>();

        double sum = 0;
        for (double el : arr) {
            addRating(el);
            sum += el;
        }
        setCount(arr.length);
    }

    public void addRating(double num) {
        if (num >= 2 && num <= 6) {
            grades.add(num);
            setCount(getCount() + 1);
        }
    }

    public void calculate() {
        if (getCount() <= 0) return;

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        setSum(sum);
        setAvg(sum / grades.size());
    }

    public void displayInfo() {
        System.out.printf("Count: %d %n Sum: %.2f %n Avg: %.2f %n ", getCount(), getSum(), getAvg());
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    private void setCount(int count) {
        this.count = count;
    }

    private void setSum(double sum) {
        this.sum = sum;
    }

    private void setAvg(double avg) {
        this.avg = avg;
    }
}