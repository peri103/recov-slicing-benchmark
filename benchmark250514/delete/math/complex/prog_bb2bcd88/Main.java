import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to initialize the matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Use the write method to create a matrix
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Perform some unrelated operations
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Multiply the matrix by a vector
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Use another matrix operation to make the program more complex
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Use the read method to get a block from the matrix
        /* read */ RealMatrix blockMatrix = matrix.getSubMatrix(0, 1, 0, 1);
        
        // Print the block matrix to verify the operations
        System.out.println("Block Matrix:");
        for (int i = 0; i < blockMatrix.getRowDimension(); i++) {
            for (int j = 0; j < blockMatrix.getColumnDimension(); j++) {
                System.out.print(blockMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform additional operations to further increase complexity
        RealMatrix addedMatrix = matrix.add(transposedMatrix);
        System.out.println("Matrix after addition with its transpose:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}