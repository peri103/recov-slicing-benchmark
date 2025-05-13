import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations(3, 3);

        // Create a row vector with values
        double[] rowValues = {1.0, 2.0, 3.0};

        // Write the row vector to the first row of the matrix
        matrixOps.setRowVector(0, rowValues);

        // Additional matrix operations
        double[][] data = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(data);

        // Add matrices
        RealMatrix resultMatrix = matrixOps.addMatrix(anotherMatrix);
        System.out.println("Resulting Matrix after addition:");
        matrixOps.printMatrix(resultMatrix);

        // Perform scalar multiplication
        RealMatrix scaledMatrix = matrixOps.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        matrixOps.printMatrix(scaledMatrix);

        // Read the row vector from the first row of the matrix
        /* read */ RealVector rowVector = matrixOps.getRowVector(0);

        // Initialize vector operations
        VectorOperations vectorOps = new VectorOperations(rowVector.toArray());

        // Print the values of the row vector
        vectorOps.printVector(rowVector);

        // Calculate the norm of the row vector
        double norm = vectorOps.getNorm();
        System.out.println("Norm of the Row Vector: " + norm);

        // Create another vector and perform addition
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{3.0, 3.0, 3.0});
        RealVector addedVector = vectorOps.addVector(anotherVector);
        System.out.println("Added Vector: " + addedVector);
    }
}