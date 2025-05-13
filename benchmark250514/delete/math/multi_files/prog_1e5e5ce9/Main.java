import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");

        // Set matrix data for the student
        double[] columnData = {1.0, 2.0, 3.0};
        student.setMatrixData(columnData);

        // Perform operations with the student's matrix
        RealMatrix matrix = student.getMatrix();
        double scalar = 2.0;
        RealMatrix scaledMatrix = matrix.scalarMultiply(scalar);

        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println("Scaled Matrix Entry " + i + ": " + scaledMatrix.getEntry(i, 0));
        }

        // Read the column real matrix using the read method
        /* read */ RealMatrix readMatrix = student.getMatrix();

        // Print the read matrix
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println("Read Matrix Entry " + i + ": " + readMatrix.getEntry(i, 0));
        }
    }
}