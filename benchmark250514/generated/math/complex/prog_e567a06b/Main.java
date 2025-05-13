import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the matrix
        double[] data = {1.0, 2.0, 3.0};
        
        // Use the write method to create a column real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Create an unrelated matrix and perform operations on it
        double[][] unrelatedData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix unrelatedMatrix = MatrixUtils.createRealMatrix(unrelatedData);
        RealVector vector = new ArrayRealVector(new double[] {1.0, 0.0, 0.0});
        RealVector resultVector = unrelatedMatrix.operate(vector);
        
        // Print the result of the unrelated matrix operation
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Additional operations on the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Use the read method to retrieve the column real matrix
        /* read */ RealMatrix retrievedMatrix = matrix.getColumnMatrix(0);
        
        // Print the retrieved matrix to verify the read operation
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}