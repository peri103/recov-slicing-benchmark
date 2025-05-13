import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize column data
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a column matrix
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = columnMatrix.transpose();
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealMatrix multipliedMatrix = columnMatrix.multiply(transposedMatrix);
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Print the result of vector operation
        System.out.println("Result of vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Retrieve the column matrix again
        /* read */ RealMatrix readColumnMatrix = columnMatrix.getColumnMatrix(0);
        
        // Print the matrix to ensure the value is read correctly
        System.out.println("Read column matrix:");
        for (int i = 0; i < readColumnMatrix.getRowDimension(); i++) {
            System.out.println(readColumnMatrix.getEntry(i, 0));
        }
        
        // Additional operations with another matrix
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(matrixData);
        RealMatrix sumMatrix = anotherMatrix.add(multipliedMatrix);
        
        // Print the sum matrix
        System.out.println("Sum matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}