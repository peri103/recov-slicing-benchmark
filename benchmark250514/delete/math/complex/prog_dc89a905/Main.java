import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create a column vector and perform some operations
        double[] columnData = {4.0, 5.0, 6.0};
        RealVector columnVector = new ArrayRealVector(columnData);
        
        // Add column vector to the matrix
        RealMatrix expandedMatrix = matrix.add(columnVector.outerProduct(columnVector));
        
        // Perform matrix multiplication
        RealMatrix multipliedMatrix = expandedMatrix.multiply(expandedMatrix.transpose());
        
        // Extract a submatrix
        RealMatrix subMatrix = multipliedMatrix.getSubMatrix(0, 1, 0, 1);
        
        // Print the submatrix
        for (int i = 0; i < subMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subMatrix.getColumnDimension(); j++) {
                System.out.print(subMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on the original matrix
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the original matrix: " + determinant);
        
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Print the values read from the original matrix
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}