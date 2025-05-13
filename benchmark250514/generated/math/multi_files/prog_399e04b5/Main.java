import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations(10);
        vectorOps.setVectorEntry(0, 5.5);

        Course mathCourse = new Course("Mathematics");
        mathCourse.addGrade(85.0);
        mathCourse.addGrade(90.5);

        ArrayList<Double> mathGrades = mathCourse.getGrades();
        double average = 0;
        for (double grade : mathGrades) {
            average += grade;
        }
        average /= mathGrades.size();
        System.out.println("Average grade in " + mathCourse.getCourseName() + ": " + average);

        /* read */ double value = vectorOps.getVectorEntry(0);
        System.out.println("Value from vector: " + value);
    }
}