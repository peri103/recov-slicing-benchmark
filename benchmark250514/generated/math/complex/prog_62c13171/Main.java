import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for matrix creation
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a vector and perform operations on it
        RealVector vector = new ArrayRealVector(data);
        vector.mapMultiplyToSelf(2.0); // Multiply each element by 2
        
        // Create another matrix using the modified vector
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(vector.toArray());
        
        // Perform some operations on the second matrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create the main matrix using the original data
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Perform some unrelated calculations
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        System.out.println("Sum of data: " + sum);
        
        // Access the row matrix from the main matrix
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Printing the read matrix to verify the result
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}