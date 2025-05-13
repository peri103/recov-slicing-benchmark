import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        // Set a value in the matrix
        /* write */ matrix.setEntry(1, 1, 5.5);

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.add(identityMatrix);
        
        // Print the result of addition
        System.out.println("Resulting Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create another matrix and multiply with the original matrix
        BlockRealMatrix anotherMatrix = new BlockRealMatrix(3, 3);
        anotherMatrix.setEntry(0, 0, 2.0);
        anotherMatrix.setEntry(1, 1, 3.0);
        anotherMatrix.setEntry(2, 2, 4.0);
        
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix);
        
        // Print the result of multiplication
        System.out.println("Resulting Matrix after multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Print the value to verify it's correctly read
        System.out.println("Read value: " + value);
        
        // Perform some additional operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}