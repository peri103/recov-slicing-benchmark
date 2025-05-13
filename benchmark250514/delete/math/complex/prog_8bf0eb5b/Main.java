import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the column matrix
        double[][] columnData = {{1.0}, {2.0}, {3.0}};
        
        // Create a column real matrix using MatrixUtils
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Additional complex operations
        // Create another matrix and perform matrix addition
        double[][] additionalData = {{4.0}, {5.0}, {6.0}};
        RealMatrix additionalMatrix = MatrixUtils.createColumnRealMatrix(additionalData);
        RealMatrix sumMatrix = columnMatrix.add(additionalMatrix);
        
        // Create a vector and perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = sumMatrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the column real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the read matrix to verify the result
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }

        // Additional operations
        // Transpose the read matrix and print it
        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}