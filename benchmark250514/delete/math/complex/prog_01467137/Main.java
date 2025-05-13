import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row real vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Write the row vector to the matrix
        /* write */ matrix.setRowVector(0, rowVector);

        // Additional matrix operations
        double[][] additionalData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(additionalMatrix);

        // Calculate the norm of a row vector
        double norm = rowVector.getNorm();
        System.out.println("Norm of the row vector: " + norm);

        // Transpose the result matrix
        RealMatrix transposedMatrix = resultMatrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }

        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);

        // Multiply the matrix with a scalar
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix: ");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println(scaledMatrix.getRowVector(i));
        }
    }
}