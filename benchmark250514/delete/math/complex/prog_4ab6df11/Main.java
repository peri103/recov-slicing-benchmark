import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix of size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Initialize another matrix for unrelated operations
        RealMatrix unrelatedMatrix = MatrixUtils.createRealMatrix(3, 3);
        unrelatedMatrix.setEntry(0, 0, 2.0);
        unrelatedMatrix.setEntry(1, 1, 3.0);
        unrelatedMatrix.setEntry(2, 2, 4.0);

        // Perform some calculations on the unrelated matrix
        double trace = unrelatedMatrix.getTrace();
        System.out.println("Trace of unrelated matrix: " + trace);

        // Write a value to the symmetric matrix
        /* write */ matrix.setEntry(1, 2, 5.0);

        // Perform more operations on the unrelated matrix
        RealMatrix transposedMatrix = unrelatedMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Initialize another symmetric matrix for different operations
        SymmetricMatrix anotherMatrix = new SymmetricMatrix(3);
        anotherMatrix.setEntry(0, 1, 7.0);
        anotherMatrix.setEntry(2, 0, 8.0);

        // Perform some operations on the new symmetric matrix
        double anotherValue = anotherMatrix.getEntry(0, 1);
        System.out.println("Value from another matrix: " + anotherValue);

        // Read the value back from the original symmetric matrix
        /* read */ double value = matrix.getEntry(1, 2);
        System.out.println("Value from symmetric matrix: " + value);

        // Final operation on unrelated matrix
        double sum = 0.0;
        for (int i = 0; i < unrelatedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < unrelatedMatrix.getColumnDimension(); j++) {
                sum += unrelatedMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all entries in unrelated matrix: " + sum);
    }
}