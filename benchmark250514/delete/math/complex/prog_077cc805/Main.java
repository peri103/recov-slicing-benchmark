import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Creating an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Additional code to manipulate matrices
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        
        RealMatrix matrixB = MatrixUtils.createRealMatrix(new double[][] {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        });

        // Matrix addition
        RealMatrix resultMatrix = matrixA.add(matrixB);
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Vector operations
        RealVector vectorA = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector vectorB = new ArrayRealVector(new double[] {4, 5, 6});

        RealVector vectorSum = vectorA.add(vectorB);
        System.out.println("Vector Addition Result:");
        for (int i = 0; i < vectorSum.getDimension(); i++) {
            System.out.print(vectorSum.getEntry(i) + " ");
        }
        System.out.println();

        // Reading the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix;

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Further matrix operations
        RealMatrix multipliedMatrix = matrixA.multiply(identityMatrix);
        System.out.println("Matrix Multiplication with Identity Matrix Result:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}