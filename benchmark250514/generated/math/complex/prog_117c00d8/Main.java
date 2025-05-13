import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Create another matrix for additional operations
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(columnMatrix);
        
        // Perform matrix multiplication
        RealMatrix productMatrix = matrix.multiply(columnMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Print the product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some unrelated calculations
        double[] unrelatedData = {13.0, 14.0, 15.0};
        RealMatrix unrelatedMatrix = MatrixUtils.createColumnRealMatrix(unrelatedData);
        double scalar = 2.0;
        RealMatrix scaledMatrix = unrelatedMatrix.scalarMultiply(scalar);

        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println(scaledMatrix.getEntry(i, 0));
        }

        /* read */ RealMatrix retrievedMatrix = columnMatrix.getColumnMatrix(0);
        
        System.out.println("Column Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}