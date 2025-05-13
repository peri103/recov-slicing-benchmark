import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        RealMatrix denseMatrix = new Array2DRowRealMatrix(3, 3);
        
        // Initialize dense matrix with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                denseMatrix.setEntry(i, j, i + j);
            }
        }
        
        // Perform some operations on dense matrix
        RealMatrix transposedMatrix = denseMatrix.transpose();
        RealMatrix productMatrix = denseMatrix.multiply(transposedMatrix);
        
        // Print the product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* write */ matrix.setEntry(0, 0, 5.5);
        
        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);
        
        // More matrix operations
        double[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(data);
        RealMatrix addedMatrix = denseMatrix.add(anotherMatrix);
        
        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println("Sparse Matrix Entry at (0,0): " + value);
    }
}