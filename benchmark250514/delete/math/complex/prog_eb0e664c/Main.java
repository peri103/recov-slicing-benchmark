import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);

        // Perform some operations with a RealMatrix
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix.setEntry(i, j, i * j + 1);
            }
        }
        
        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Write a value to the vector
        /* write */ vector.setEntry(0, 3.14);

        // Perform some calculations with the vector
        vector.setEntry(1, 2.71);
        vector.setEntry(2, 1.41);
        
        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        // Further operations on the vector
        vector.mapMultiplyToSelf(2.0);
        vector.mapAddToSelf(1.0);

        // Calculate the dot product with another vector
        OpenMapRealVector anotherVector = MatrixUtils.createOpenMapRealVector(5);
        anotherVector.setEntry(0, 1.0);
        anotherVector.setEntry(1, 1.0);
        anotherVector.setEntry(2, 1.0);
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot product: " + dotProduct);

        // Read the value from the vector
        /* read */ double value = vector.getEntry(0);

        // Print the value
        System.out.println("Value read from the vector: " + value);
    }
}