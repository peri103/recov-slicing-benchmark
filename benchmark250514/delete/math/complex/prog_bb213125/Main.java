import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Write: create a row real vector and set it in the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setRowVector(0, rowVector);
        
        // Additional complex operations
        // Create another matrix
        double[][] data2 = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        
        // Add two matrices
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Multiply the result matrix by a scalar
        RealMatrix scaledMatrix = resultMatrix.scalarMultiply(2.0);
        
        // Print the scaled matrix to verify
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read: get the row real vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the vector to verify
        System.out.println("Read Vector:");
        System.out.println(readVector);
        
        // Perform some operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(3.0);
        RealVector addedVector = scaledVector.add(MatrixUtils.createRowRealVector(new double[]{1.0, 1.0, 1.0}));
        
        // Print the manipulated vector
        System.out.println("Manipulated Vector:");
        System.out.println(addedVector);
    }
}