import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and some columns
        double[][] initialData = { {1.0, 2.0, 3.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);

        // Create a row real vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[] {4.0, 5.0, 6.0});
        
        // Perform some unrelated operations
        double[][] additionalData = { {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0} };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        // Add matrices
        RealMatrix combinedMatrix = matrix.add(additionalMatrix);
        System.out.println("Combined Matrix:");
        for (int i = 0; i < combinedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < combinedMatrix.getColumnDimension(); j++) {
                System.out.print(combinedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Replace the first row of the matrix with the new vector
        /* write */ matrix.setRowVector(0, rowVector);

        // Perform more operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get the first row real vector
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the vector to ensure it matches what was written
        System.out.println("Read Vector: " + readVector);

        // Perform additional operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
    }
}