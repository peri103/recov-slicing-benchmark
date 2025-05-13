import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the row data for matrix operations
        double[] rowData = {1.0, 2.0, 3.0};
        MatrixOperations matrixOps = new MatrixOperations(rowData);

        // Perform some matrix operations
        RealMatrix multipliedMatrix = matrixOps.multiplyMatrix(2.0);
        double determinant = matrixOps.getDeterminant();
        System.out.println("Determinant of the original matrix: " + determinant);

        // Create a student and add grades
        Student student = new Student("John Doe");
        student.addGrade(85.5);
        student.addGrade(90.0);
        student.addGrade(76.5);

        // Calculate and print the student's average grade
        double averageGrade = student.calculateAverage();
        System.out.println("Average grade for " + student.name + ": " + averageGrade);

        // Read the row matrix using the read method
        /* read */ RealMatrix readMatrix = matrixOps.getMatrix();

        // Print the read matrix
        System.out.println("Read matrix row: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        // Additional operations on the student's grades
        System.out.println("Student's grades: " + student.getGrades());
    }
}