import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] initialGrades = {{85.0, 90.0, 92.0}};
        Student student = new Student("Alice", initialGrades);

        student.printGrades();

        // Update grades
        double[] newGrades = {88.0, 91.0, 93.0};
        student.updateGrades(0, newGrades);

        // Retrieve and print updated grades
        /* read */ RealVector updatedGrades = student.getGrades(0);
        System.out.println("Updated Grades: " + updatedGrades);

        // Additional operations
        double norm = updatedGrades.getNorm();
        System.out.println("Norm of updated grades: " + norm);
    }
}