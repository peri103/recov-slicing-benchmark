import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to be used for creating a BlockRealMatrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ 
        // Use MatrixUtils to create a BlockRealMatrix from the 2D array
        BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Create a RealVector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the vector operation
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // More matrix operations
        RealMatrix addedMatrix = matrix.add(transposedMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ 
        // Retrieve the BlockRealMatrix using MatrixUtils (in this case, it's the same object)
        BlockRealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData());
        
        // Print the contents of the retrieved matrix to verify
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform more operations on the retrieved matrix
        RealMatrix subMatrix = retrievedMatrix.getSubMatrix(0, 1, 0, 1);
        System.out.println("Sub Matrix:");
        for (int i = 0; i < subMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subMatrix.getColumnDimension(); j++) {
                System.out.print(subMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}