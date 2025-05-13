import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a 2x2 matrix with initial values
        double[][] initialData = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Perform a random operation on the vector
        Random random = new Random();
        double randomValue = random.nextDouble();
        RealVector scaledVector = vector.mapMultiply(randomValue);
        
        // Print out the scaled vector
        System.out.println("Scaled Vector: " + scaledVector);
        
        // Perform matrix multiplication with another matrix
        double[][] anotherData = {{7.0, 8.0}, {9.0, 10.0}};
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(anotherData);
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        
        // Print out the multiplied matrix
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform addition of the original matrix with another matrix
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        // Print out the sum matrix
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the first entry of the original matrix
        /* read */ double value = matrix.getEntry(0, 0); // Reading the first element (1.0)
        System.out.println("Read Value: " + value);
    }
}