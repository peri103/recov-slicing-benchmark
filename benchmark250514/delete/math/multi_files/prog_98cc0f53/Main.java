import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        double[][] initialData = { {1.0, 2.0, 3.0} };
        MatrixOperations matrixOps = new MatrixOperations(initialData);
        matrixOps.replaceRowVector(0, new double[] {4.0, 5.0, 6.0});

        MatrixReader matrixReader = new MatrixReader(matrixOps.getMatrix());
        RealVector readVector = matrixReader.getRowVector(0);

        System.out.println("Read Vector: " + readVector);

        // Student operations
        Student student = new Student("John Doe");
        student.addGrade(85.5);
        student.addGrade(92.0);
        student.addGrade(78.3);

        System.out.println("Grades: " + student.getGrades());
        System.out.println("Average Grade: " + student.calculateAverage());
    }
}