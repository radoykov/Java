public class Student extends Human {
    private float grade;

    public Student(String firstName, String lastName, float grade) {
        super(firstName, lastName);
        setGrade(grade);
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float num) {
        if (num >= 2 && num <= 6) {
            this.grade = num;
        } else {
            System.out.println("Error");
        }
    }
}