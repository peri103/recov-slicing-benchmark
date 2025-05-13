import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize an array to create a diagonal matrix
        double[] diagonalValues = {1.0, 2.0, 3.0};

        // Create a diagonal matrix using the write method
        /* write */ RealMatrix diagonalMatrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Additional matrix operations
        double[][] data = {{1, 2}, {3, 4}};
        RealMatrix matrixA = MatrixUtils.createRealMatrix(data);
        RealVector vectorB = new ArrayRealVector(new double[]{5, 6});

        // Perform matrix-vector multiplication
        RealVector resultVector = matrixA.operate(vectorB);
        System.out.println("Matrix-vector multiplication result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Manipulate the diagonal matrix before reading
        diagonalMatrix.setEntry(0, 0, 10.0);  // Modify one of the diagonal elements

        // Read the diagonal matrix using the read method
        /* read */ RealMatrix readMatrix = diagonalMatrix;  // In this context, the getDiagonalMatrix method is not explicitly provided by MatrixUtils. We assume the matrix created is the one we need to read.

        // Print the diagonal values to verify
        System.out.println("Diagonal matrix values:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, i));
        }

        // Additional calculations with the diagonal matrix
        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed diagonal matrix values:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}