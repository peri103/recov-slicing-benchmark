import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a matrix with a single column using the write method
        RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Create another matrix for additional operations
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(data);
        
        // Perform some operations on the additional matrix
        RealMatrix transposedMatrix = additionalMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Calculate the sum of elements in the first row of the additional matrix
        double rowSum = 0;
        for (int i = 0; i < additionalMatrix.getColumnDimension(); i++) {
            rowSum += additionalMatrix.getEntry(0, i);
        }
        System.out.println("Sum of the first row: " + rowSum);
        
        // Use the read method to get the column vector from the original matrix
        /* read */ RealVector columnVector = matrix.getColumnVector(0);
        
        // Print the column vector to verify the read operation
        System.out.println("Column Vector:");
        for (int i = 0; i < columnVector.getDimension(); i++) {
            System.out.println(columnVector.getEntry(i));
        }
        
        // Perform additional unrelated operations
        double[] newVectorData = {7.0, 8.0, 9.0};
        RealVector newVector = MatrixUtils.createRealVector(newVectorData);
        RealVector resultVector = columnVector.add(newVector);
        
        System.out.println("Resultant Vector after addition:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
    }
}