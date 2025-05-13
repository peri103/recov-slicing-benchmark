import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        RealMatrix matrix2 = new Array2DRowRealMatrix(3, 3);
        RealVector vector = new ArrayRealVector(3);

        /* write */ matrix.setEntry(0, 0, 5.0);

        // Initialize the second matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.setEntry(i, j, i + j);
            }
        }

        // Perform a matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Initialize the vector with some values
        for (int i = 0; i < 3; i++) {
            vector.setEntry(i, i * 2.0);
        }

        // Perform matrix-vector multiplication
        RealVector resultVector = resultMatrix.operate(vector);

        // Print the resulting vector
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Vector entry " + i + ": " + resultVector.getEntry(i));
        }

        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println("Read value: " + value);

        // Additional matrix operations
        RealMatrix transposedMatrix = resultMatrix.transpose();
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.println("Transposed matrix entry (" + i + ", " + j + "): " + transposedMatrix.getEntry(i, j));
            }
        }
    }
}