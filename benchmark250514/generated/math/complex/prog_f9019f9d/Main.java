import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the column matrix
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a row matrix for additional complexity
        double[][] rowData = {{4.0, 5.0, 6.0}};
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData[0]);
        
        // Perform operations on the row matrix
        RealVector rowVector = new ArrayRealVector(rowMatrix.getRow(0));
        RealVector scaledVector = rowVector.mapMultiply(2.0);
        
        // Print the scaled vector values
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
        
        // Create a column matrix with the write method
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform some operations on the column matrix
        RealMatrix transposedMatrix = columnMatrix.transpose();
        RealMatrix multipliedMatrix = transposedMatrix.multiply(columnMatrix);
        
        // Print the multiplied matrix values
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the column matrix using the read method
        /* read */ RealMatrix readMatrix = columnMatrix.getColumnMatrix(0);
        
        // Print the values of the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }
        
        // Additional matrix operations for complexity
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = identityMatrix.add(multipliedMatrix);
        
        // Print the result matrix values
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}