import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations();
        
        // Create and operate on identity matrix
        matrixOps.createIdentityMatrix(3);
        
        // Multiply identity matrix by a vector
        RealVector resultVector = matrixOps.multiplyWithVector(new double[] {1.0, 2.0, 3.0});
        System.out.println("Result of multiplying identity matrix by vector:");
        MatrixPrinter.printVector(resultVector);

        // Create another matrix and perform addition with the identity matrix
        RealMatrix matrixToAdd = MatrixUtils.createRealMatrix(new double[][] {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });

        RealMatrix sumMatrix = matrixOps.addMatrix(matrixToAdd);
        System.out.println("Resulting matrix after addition:");
        MatrixPrinter.printMatrix(sumMatrix);

        // Read and print the identity matrix
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();
        System.out.println("Identity Matrix:");
        MatrixPrinter.printMatrix(readMatrix);
    }
}