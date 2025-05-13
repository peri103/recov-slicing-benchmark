import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Creating another matrix using Array2DRowRealMatrix
        double[][] additionalData = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        // Performing matrix addition
        RealMatrix sumMatrix = matrix.add(additionalMatrix);

        // Displaying the result of matrix addition
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Performing matrix multiplication
        RealMatrix productMatrix = matrix.multiply(additionalMatrix);

        // Displaying the result of matrix multiplication
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Extracting a submatrix from the original matrix
        /* read */ RealMatrix readMatrix = matrix.getSubMatrix(0, 1, 0, 1);
        
        // Displaying the extracted submatrix
        System.out.println("Extracted Submatrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}