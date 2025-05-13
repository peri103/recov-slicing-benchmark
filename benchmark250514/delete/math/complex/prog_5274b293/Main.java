import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixDimensionMismatchException;

public class Main {
    public static void main(String[] args) {
        double[][] data1 = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        double[][] data2 = {
            {5.0, 6.0},
            {7.0, 8.0}
        };

        /* write */
        BlockRealMatrix matrix1 = MatrixUtils.createBlockRealMatrix(data1);

        // Perform some operations on matrix1
        BlockRealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);
        
        try {
            RealMatrix sumMatrix = matrix1.add(matrix2);
            System.out.println("Sum Matrix:");
            for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
                for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                    System.out.print(sumMatrix.getEntry(i, j) + " ");
                }
                System.out.println();
            }
        } catch (MatrixDimensionMismatchException e) {
            System.out.println("Matrices dimensions do not match for addition.");
        }

        // Some unrelated calculations
        double[][] data3 = {
            {1.5, 2.5},
            {3.5, 4.5}
        };
        BlockRealMatrix matrix3 = MatrixUtils.createBlockRealMatrix(data3);
        RealMatrix scalarMultipliedMatrix = matrix3.scalarMultiply(2.0);

        System.out.println("Scalar Multiplied Matrix:");
        for (int i = 0; i < scalarMultipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scalarMultipliedMatrix.getColumnDimension(); j++) {
                System.out.print(scalarMultipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */
        BlockRealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix1.getData());
        
        System.out.println("Original Matrix1:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}