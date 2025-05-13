import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Create a column matrix and perform some operations
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(additionalData);
        RealMatrix resultMatrix = matrix.multiply(columnMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(rowData);
        RealVector scaledVector = vector.mapMultiply(2.0);

        // Intermediate operations
        double sum = 0.0;
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            sum += scaledVector.getEntry(i);
        }
        System.out.println("Sum of scaled vector: " + sum);

        // More matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the original row matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.createRowRealMatrix(matrix.getRow(0));

        // Print the read matrix
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}