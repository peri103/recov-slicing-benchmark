import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        // Create another matrix with different data
        double[] anotherRowData = {4.0, 5.0, 6.0};
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRowData);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Print the scaled vector values
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        // Print the sum matrix to verify the addition
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        // Print the read matrix to verify the values
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}