import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some data
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Create a vector to write into the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[] {10.0, 11.0, 12.0});
        
        /* write */ matrix.setRowVector(1, vector);
        
        // Perform some unrelated operations
        RealVector anotherVector = new ArrayRealVector(new double[] {3.0, 2.0, 1.0});
        RealVector resultVector = vector.add(anotherVector);
        System.out.println("Resultant Vector after addition: " + resultVector);
        
        // Initialize another matrix and perform operations
        double[][] anotherMatrixData = {
            {2.0, 0.0, 1.0},
            {0.0, 2.0, 1.0},
            {1.0, 1.0, 0.0}
        };
        
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getRowVector(i));
        }
        
        // More complex operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
        
        // Read the vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);
        
        // Print the read vector
        System.out.println("Read Vector: " + readVector);
        
        // Further matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }
    }
}