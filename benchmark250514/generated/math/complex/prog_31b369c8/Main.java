import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] columnData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Creating another matrix using a different method
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Performing some operations on the matrices
        RealMatrix resultMatrix = matrix.multiply(columnMatrix.transpose());
        
        // Creating a vector and performing operations
        RealVector vector = new ArrayRealVector(rowData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Printing the result of matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Printing the scaled vector
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Further operations on the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Now, retrieving the row matrix
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        // Printing the retrieved matrix
        System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}