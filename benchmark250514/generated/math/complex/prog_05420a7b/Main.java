import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a new matrix using another method for demonstration
        double[][] matrixData = {{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix2 = new Array2DRowRealMatrix(matrixData);
        
        // Perform some operations on matrix2
        RealMatrix transposedMatrix = matrix2.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Original write-read pair
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Perform some unrelated calculations
        double[][] randomData = {{10.0, 11.0}, {12.0, 13.0}};
        RealMatrix randomMatrix = new Array2DRowRealMatrix(randomData);
        RealMatrix resultMatrix = randomMatrix.multiply(transposedMatrix);
        System.out.println("Result Matrix after multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // More operations on matrix2
        RealMatrix scaledMatrix = matrix2.scalarAdd(1.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Original read operation
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Print the read values from the matrix
        System.out.print("Read Matrix: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
    }
}