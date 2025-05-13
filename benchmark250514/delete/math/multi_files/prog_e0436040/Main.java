import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a MatrixOperations instance and create a diagonal matrix
        MatrixOperations matrixOps = new MatrixOperations();
        double[] diagonalValues = {1.0, 2.0, 3.0};
        matrixOps.createDiagonalMatrix(diagonalValues);

        // Create a Student and add grades
        Student student = new Student("John Doe");
        student.addGrade(85.0);
        student.addGrade(90.5);
        student.addGrade(78.0);

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Grades: " + student.getGrades());

        // Read the diagonal matrix data
        RealMatrix diagonalMatrix = matrixOps.getDiagonalMatrix();
        /* read */ double[][] matrixData = diagonalMatrix.getData();
        
        // Print the diagonal matrix
        System.out.println("Diagonal Matrix:");
        for (double[] row : matrixData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}