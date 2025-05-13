import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the matrix
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a row real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Perform some operations on the matrix
        double[][] additionalData = {{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        
        // Add the two matrices
        RealMatrix combinedMatrix = matrix.add(additionalMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{10.0, 20.0, 30.0});
        RealVector resultVector = combinedMatrix.operate(vector);
        
        // Print the result vector
        System.out.println("Resulting vector: ");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Complex operation with matrix
        RealMatrix transposedMatrix = combinedMatrix.transpose();
        
        // Some unrelated calculations
        double sum = 0;
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                sum += transposedMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all elements in transposed matrix: " + sum);
        
        // Retrieve the original row matrix
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        System.out.println("Original matrix row: ");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}