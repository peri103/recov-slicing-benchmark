import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a RealMatrix
        double[][] data = { {1.0, 2.0, 3.0}, {4.0, 5.0, 6.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a column vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[] {7.0, 8.0});
        
        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);
        
        // Perform some unrelated operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        RealMatrix productMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create another vector and perform vector addition
        RealVector anotherVector = new ArrayRealVector(new double[] {1.0, 1.0});
        RealVector sumVector = columnVector.add(anotherVector);
        System.out.println("Sum Vector: " + sumVector);
        
        // Read the column vector back using the read method
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Print the read vector
        System.out.println("Read Vector: " + readVector);
        
        // Further operations on the read vector
        double norm = readVector.getNorm();
        System.out.println("Norm of the Read Vector: " + norm);
        
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Read Vector: " + scaledVector);
    }
}