import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix data
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create MatrixOperations instance
        MatrixOperations matrixOps = new MatrixOperations(matrixData);

        // Create VectorOperations instance and create a vector
        VectorOperations vectorOps = new VectorOperations();
        double[] rowData = {7.0, 8.0, 9.0};
        vectorOps.createVector(rowData);

        // Set the vector as a row in the matrix
        RealVector vector = vectorOps.getVector();
        matrixOps.setRowVector(1, vector);

        // Get the row vector from the matrix
        RealVector readVector = matrixOps.getRowVector(1);

        // Print the read vector
        System.out.println("Read Vector:");
        System.out.println(readVector);

        // Perform additional operations on the matrix
        RealMatrix matrix = matrixOps.getMatrix();
        RealMatrix multipliedMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getRowVector(i));
        }
    }
}