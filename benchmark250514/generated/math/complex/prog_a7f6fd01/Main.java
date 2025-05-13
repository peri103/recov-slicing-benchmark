import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an array to represent a row vector
        double[] rowData = {1.0, 2.0, 3.0};
        
        // Use MatrixUtils to create a row real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create another matrix for demonstration purposes
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(matrixData);

        // Perform some operations on the other matrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the row real matrix using MatrixUtils (though typically this would be done directly from the matrix object)
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        // Print the retrieved matrix row
        System.out.println("Retrieved Matrix Row:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
    }
}