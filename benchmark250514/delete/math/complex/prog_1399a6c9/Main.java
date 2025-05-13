import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        RealMatrix matrix = MatrixUtils.createRealMatrix(1, 3);
        
        // Create a row vector using createRowRealVector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Set the row vector into the matrix
        matrix.setRowVector(0, /* write */ rowVector);
        
        // Perform some matrix operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{4.0, 5.0, 6.0}});
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        
        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create another vector
        RealVector anotherRowVector = MatrixUtils.createRowRealVector(new double[]{7.0, 8.0, 9.0});
        
        // Perform vector addition
        RealVector sumVector = rowVector.add(anotherRowVector);
        
        // Print the result of vector addition
        System.out.println("Result of vector addition:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.print(sumVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Retrieve the row vector using getRowVector
        RealVector retrievedRowVector = /* read */ matrix.getRowVector(0);
        
        // Print the retrieved row vector
        System.out.println("Retrieved row vector:");
        for (int i = 0; i < retrievedRowVector.getDimension(); i++) {
            System.out.print(retrievedRowVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}