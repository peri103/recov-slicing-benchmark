import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define initial data for the matrix
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a column real matrix using the data
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);

        // Perform some unrelated matrix operations to increase complexity
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.multiply(identityMatrix);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);

        // More operations using the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Extract a column from the matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the extracted column matrix
        System.out.println("Extracted column matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }

        // Additional operations to add complexity
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        System.out.println("Matrix after addition:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}