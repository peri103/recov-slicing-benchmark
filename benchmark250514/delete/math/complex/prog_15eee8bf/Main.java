import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Initialize another matrix
        double[][] data2 = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the matrix
        BlockRealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);
        BlockRealMatrix sumMatrix = matrix.add(matrix2);
        
        // Initialize a vector
        double[] vectorData = {1.0, 2.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform vector operations
        RealVector resultVector = matrix.operate(vector);

        // Print the result of vector operations
        System.out.println("Resulting vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More operations on matrices
        BlockRealMatrix productMatrix = matrix.multiply(matrix2);

        // Print product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the original matrix
        /* read */ BlockRealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData());

        // Print the matrix read
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}