import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();
        Inheritance inh = new Inheritance();
        System.out.println(inh);
        inh.getInfo();


        System.out.println(sample.sum() + " " + sample.sum(1, 10));

        System.out.println("Exercise students <-->");

        Student[] students = new Student[10];
        students[0] = new Student("A1", "B1", 2f);
        students[1] = new Student("A2", "B2", 3.50f);
        students[2] = new Student("A3", "B3", 5.25f);
        students[3] = new Student("A4", "B4", 6f);
        students[4] = new Student("A5", "B5", 4f);
        students[5] = new Student("A6", "B6", 3.56f);
        students[6] = new Student("A7", "B7", 5.49f);
        students[7] = new Student("A8", "B8", 2.80f);
        students[8] = new Student("A9", "B9", 5f);
        students[9] = new Student("A10", "B10", 6f);

        students[2].setGrade(6);

        Arrays.sort(students, (s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()));
        for(Student student : students){
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGrade());
        }

        System.out.println("Exercise workers <-->");

        Worker[] workers = new Worker[10];
        workers[0] = new Worker("A1", "B1", 2000d, 2);
        workers[1] = new Worker("A2", "B2", 1250d, 5);
        workers[2] = new Worker("A3", "B3", 1500.60d, 8);
        workers[3] = new Worker("A4", "B4", 3000.70d, 4);
        workers[4] = new Worker("A5", "B5", 150.50d, 6);
        workers[5] = new Worker("A6", "B6", 300d, 1);
        workers[6] = new Worker("A7", "B7", 265d, 7);
        workers[7] = new Worker("A8", "B8", 586d, 2);
        workers[8] = new Worker("A9", "B9", 268d, 6);
        workers[9] = new Worker("A10", "B10", 867d, 7);

        Arrays.sort(workers, (s1, s2) -> Double.compare(s1.calculateHourSalary(), s2.calculateHourSalary()));
        for(Worker worker : workers){
            System.out.println(worker.getFirstName() + " " + worker.getLastName() + " " + worker.calculateHourSalary() + "$");
        }
    }
}