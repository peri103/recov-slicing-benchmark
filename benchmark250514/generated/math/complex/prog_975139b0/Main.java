import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the SparseRealMatrix with a specified size
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Initialize another matrix for additional complexity
        SparseRealMatrix anotherMatrix = new OpenMapRealMatrix(3, 3);

        // Write a value to the matrix at a specific position
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform some calculations with anotherMatrix
        anotherMatrix.setEntry(1, 1, 10.0);
        anotherMatrix.setEntry(2, 2, 15.0);

        // Add the two matrices together
        RealMatrix resultMatrix = matrix.add(anotherMatrix);

        // Print out the result of the addition
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the original matrix at the same position
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify it was correctly written and read
        System.out.println("Read value from original matrix: " + value);

        // Perform some additional operations on the matrices
        double trace = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            trace += matrix.getEntry(i, i);
        }
        System.out.println("Trace of the original matrix: " + trace);

        double anotherTrace = 0;
        for (int i = 0; i < anotherMatrix.getRowDimension(); i++) {
            anotherTrace += anotherMatrix.getEntry(i, i);
        }
        System.out.println("Trace of the another matrix: " + anotherTrace);
    }
}