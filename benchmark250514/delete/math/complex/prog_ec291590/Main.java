import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with a specific size
        int size = 3; // example size
        SymmetricMatrix matrix = new SymmetricMatrix(size);
        
        // Set a value in the matrix
        int row = 0, column = 1;
        double valueToWrite = 5.0;
        /* write */ matrix.setEntry(row, column, valueToWrite);
        
        // Initialize another matrix for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(size, size);
        
        // Populate the other matrix with some values
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                anotherMatrix.setEntry(i, j, i + j);
            }
        }
        
        // Perform some operations on the other matrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        RealMatrix multipliedMatrix = anotherMatrix.multiply(transposedMatrix);
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the value back from the symmetric matrix
        /* read */ double valueRead = matrix.getEntry(row, column);
        
        // Print the value to verify it was written and read correctly
        System.out.println("Value from Symmetric Matrix: " + valueRead);
    }
}