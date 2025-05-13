import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix with values
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        /* write */ 
        BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some unrelated operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        RealVector vector = new ArrayRealVector(new double[] {1.0, 1.0});
        RealVector resultVector = addedMatrix.operate(vector);

        // Print the result of unrelated operations
        System.out.println("Resulting Vector: " + resultVector);

        // More unrelated operations
        BlockRealMatrix anotherMatrix = MatrixUtils.createBlockRealMatrix(new double[][] {
            {5.0, 6.0},
            {7.0, 8.0}
        });
        
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);

        // Now read the block from the original matrix
        /* read */ 
        BlockRealMatrix readMatrix = matrix.getBlockRealMatrix(0, 0, 1, 1);

        // Print the read values
        System.out.println("Read Matrix Block: " + readMatrix);
    }
}