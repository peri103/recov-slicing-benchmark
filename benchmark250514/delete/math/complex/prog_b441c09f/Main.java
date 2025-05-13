import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create another matrix for additional operations
        double[][] additionalData = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        
        RealMatrix additionalMatrix = MatrixUtils.createBlockRealMatrix(additionalData);

        // Perform some operations on the additional matrix
        RealMatrix resultMatrix = additionalMatrix.scalarAdd(10.0);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector resultVector = vector.mapMultiply(2.0);

        // Print the result of vector operations
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = matrix; // Since the read method is not explicitly defined, using the matrix directly

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on the result matrix of the additional matrix
        RealMatrix multipliedMatrix = resultMatrix.multiply(transposedMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}