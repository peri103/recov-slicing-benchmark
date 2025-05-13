import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables for the sparse matrix
        int rows = 2;
        int columns = 2;
        double[][] data = { {1.0, 0.0}, {0.0, 1.0} };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);

        // Unrelated complex operations
        double[] vectorData = {1.0, 2.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix productMatrix = identityMatrix.multiply(sparseMatrix);
        RealVector transformedVector = productMatrix.operate(vector);

        // Print transformed vector
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.println(transformedVector.getEntry(i));
        }

        // More complex operations
        double[] additionalVectorData = {3.0, 4.0};
        RealVector additionalVector = new ArrayRealVector(additionalVectorData);
        RealVector resultVector = transformedVector.add(additionalVector);

        // Print result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the sparse matrix using the same reference
        /* read */ RealMatrix readMatrix = sparseMatrix;

        // Print the matrix to ensure the read value is correct
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional matrix operations
        RealMatrix additionMatrix = MatrixUtils.createRealMatrix(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix sumMatrix = readMatrix.add(additionMatrix);

        // Print sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}