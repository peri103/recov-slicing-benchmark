import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the array to be used in the matrix
        double[][] data = {{1.0}, {2.0}, {3.0}};
        
        // Create another matrix using MatrixUtils
        double[][] otherData = {{4.0, 5.0}, {6.0, 7.0}, {8.0, 9.0}};
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(otherData);

        // Create a RealVector to demonstrate vector operations
        RealVector vector = new ArrayRealVector(new double[]{10.0, 20.0, 30.0});

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Use the write method to create a column real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);

        // Perform matrix addition
        RealMatrix addedMatrix = matrix.add(otherMatrix);
        System.out.println("Added Matrix: " + addedMatrix);

        // Use the read method to get the column real matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        // Print the column matrix to verify the value
        System.out.println("Column Matrix: " + columnMatrix);

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(otherMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);

        // Create a new vector and perform dot product
        RealVector newVector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        double dotProduct = vector.dotProduct(newVector);
        System.out.println("Dot Product: " + dotProduct);
    }
}