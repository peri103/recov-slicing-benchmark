import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a column real vector
        /* write */ RealVector vector = MatrixUtils.createColumnRealVector(data);
        
        // Create a matrix using the vector
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
        
        // Initialize another matrix for more operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });

        // Perform some operations on anotherMatrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        RealMatrix multipliedMatrix = anotherMatrix.multiply(transposedMatrix);
        
        // Output some data from the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get the column real vector from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Output the read vector
        System.out.println("Read Vector:");
        System.out.println(readVector);

        // Perform more operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        System.out.println(scaledVector);
    }
}