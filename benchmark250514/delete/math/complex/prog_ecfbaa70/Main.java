import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Data for the main write-read pair
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Additional data for complexity
        double[][] additionalData = {
            {5.0, 6.0},
            {7.0, 8.0}
        };

        // Create another matrix for complexity
        BlockRealMatrix additionalMatrix = MatrixUtils.createBlockRealMatrix(additionalData);

        // Perform some operations on additionalMatrix
        RealMatrix transposedMatrix = additionalMatrix.transpose();
        double[][] transposedData = transposedMatrix.getData();

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedData.length; i++) {
            for (int j = 0; j < transposedData[i].length; j++) {
                System.out.print(transposedData[i][j] + " ");
            }
            System.out.println();
        }

        // Main write operation
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform operations on the main matrix
        RealMatrix multipliedMatrix = matrix.multiply(additionalMatrix);
        double[][] multipliedData = multipliedMatrix.getData();

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedData.length; i++) {
            for (int j = 0; j < multipliedData[i].length; j++) {
                System.out.print(multipliedData[i][j] + " ");
            }
            System.out.println();
        }

        // Main read operation
        /* read */ BlockRealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(data, 0, 0, 2, 2);

        System.out.println("Original Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}