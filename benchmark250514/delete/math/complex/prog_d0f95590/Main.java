import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a row real matrix with a single row
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Additional matrix operation: create a column matrix
        double[][] columnData = {{1.0}, {2.0}, {3.0}};
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(columnMatrix);

        // Calculate the transpose of the sumMatrix
        RealMatrix transposeMatrix = sumMatrix.transpose();

        // Perform scalar multiplication
        RealMatrix scaledMatrix = transposeMatrix.scalarMultiply(2.0);

        // Extract the first row of the scaled matrix into a vector
        RealVector extractedVector = scaledMatrix.getRowVector(0);

        // Print the extracted vector
        System.out.println("Extracted Vector: " + extractedVector);

        // Read the matrix using getRowRealMatrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);

        // Print the row to verify
        RealVector vector = readMatrix.getRowVector(0);
        System.out.println("Read Matrix Row: " + vector);

        // Additional operation: calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the Read Matrix Row: " + norm);

        // Perform element-wise multiplication with another matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = readMatrix.multiply(identityMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getRowVector(i));
        }
    }
}