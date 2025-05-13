import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        RealVector vector = new ArrayRealVector(3);

        // Initialize matrix2 with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.setEntry(i, j, i + j);
            }
        }

        // Initialize vector with some values
        for (int i = 0; i < 3; i++) {
            vector.setEntry(i, i * 2.0);
        }

        // Perform a matrix addition operation
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Print the result of matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Set an entry in the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Perform a vector addition operation
        RealVector resultVector = vector.add(new ArrayRealVector(new double[]{1.0, 2.0, 3.0}));

        // Print the result of vector addition
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform a matrix-vector multiplication
        RealVector multipliedVector = matrix2.operate(vector);

        // Print the result of matrix-vector multiplication
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.print(multipliedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the entry from the matrix
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println("Read value: " + value);
    }
}