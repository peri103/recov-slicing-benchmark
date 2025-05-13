import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for a matrix
        double[] columnData = {1, 2, 3};
        
        // Create a column matrix using the given data
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform some unrelated operations with vectors
        RealVector vector = new ArrayRealVector(new double[]{4, 5, 6});
        RealVector resultVector = vector.mapMultiply(2);
        
        // Print the result of vector operations
        System.out.println("Vector after multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Perform some matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        // Print the added matrix
        System.out.println("Matrix after addition with identity matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Now read the column matrix from the original matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the column matrix
        System.out.println("Column matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}