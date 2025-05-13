import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Additional operations with matrices
        double[][] additionalData = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        
        BlockRealMatrix additionalMatrix = MatrixUtils.createBlockRealMatrix(additionalData);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        
        // Print the result of the matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Some unrelated complex operations
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * i);
        }
        
        int sumOfSquares = 0;
        for (int num : list) {
            sumOfSquares += num;
        }
        
        System.out.println("Sum of squares from 0 to 9: " + sumOfSquares);
        
        // Retrieve the original matrix to ensure the read operation
        /* read */ BlockRealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 0, 2, 2);
        
        System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}