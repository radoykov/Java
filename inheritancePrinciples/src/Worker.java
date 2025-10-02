public class Worker extends Human {
    private double salaryPerDay;
    private int hours;
    private double calculatedSalary; //more sufficient from complexity side

    public Worker(String firstName, String lastName, double salary, int hours) {
        super(firstName, lastName);
        setSalaryPerDay(salary);
        setHours(hours);
        setCalculatedSalary(calculateHourSalary());
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getHours() {
        return hours;
    }

    public double getCalculatedSalary() {
        return calculatedSalary;
    }

    private void setSalaryPerDay(double salary) {
        this.salaryPerDay = salary;
    }

    private void setHours(int hours) {
        this.hours = hours;
    }

    private void setCalculatedSalary(double salary) {
        this.calculatedSalary = salary;
    }

    public double calculateHourSalary() {
        double result = getSalaryPerDay() / getHours();
        return Math.round(result * 100.0) / 100.0;
    }
}