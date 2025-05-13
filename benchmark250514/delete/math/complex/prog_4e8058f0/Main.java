import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] columnData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Additional operations with RealMatrix
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        RealMatrix combinedMatrix = matrix.add(columnMatrix.transpose());

        // Perform some operations with the combinedMatrix
        RealVector vector = combinedMatrix.getColumnVector(1);
        double sum = 0;
        for (int i = 0; i < vector.getDimension(); i++) {
            sum += vector.getEntry(i);
        }
        System.out.println("Sum of column 1: " + sum);

        // More complex operations
        RealMatrix multipliedMatrix = combinedMatrix.scalarMultiply(2.0);
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        // Output the read matrix
        System.out.print("Read matrix row: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}