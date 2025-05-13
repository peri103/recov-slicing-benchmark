import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a column matrix with some values
        double[] columnData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform some unrelated operations
        RealVector vector1 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector vector2 = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        
        // Add vectors
        RealVector sumVector = vector1.add(vector2);
        System.out.println("Sum of vectors: " + sumVector);
        
        // Scalar multiplication
        RealVector scaledVector = vector1.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);
        
        // Calculate dot product
        double dotProduct = vector1.dotProduct(vector2);
        System.out.println("Dot product: " + dotProduct);
        
        // Use another matrix operation
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        System.out.println("Identity matrix:");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the column matrix
        /* read */ RealMatrix retrievedColumnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        // Print the retrieved column matrix
        System.out.println("Retrieved column matrix:");
        for (int i = 0; i < retrievedColumnMatrix.getRowDimension(); i++) {
            System.out.println(retrievedColumnMatrix.getEntry(i, 0));
        }
    }
}