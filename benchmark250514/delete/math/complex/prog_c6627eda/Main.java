import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        // Create a random matrix for additional complexity
        Random random = new Random();
        double[][] randomMatrixData = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                randomMatrixData[i][j] = random.nextDouble() * 10;
            }
        }
        RealMatrix randomMatrix = new Array2DRowRealMatrix(randomMatrixData);
        
        // Perform some operations on the random matrix
        RealMatrix transposedMatrix = randomMatrix.transpose();
        RealMatrix multipliedMatrix = randomMatrix.multiply(transposedMatrix);
        
        // Print random matrix and its operations
        System.out.println("Random Matrix:");
        printMatrix(randomMatrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        printMatrix(multipliedMatrix);
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Some additional operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        // Print the identity matrix and the added result
        System.out.println("Identity Matrix:");
        printMatrix(identityMatrix);
        System.out.println("Added Matrix:");
        printMatrix(addedMatrix);
        
        /* read */ double[] readDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix is a method to read diagonal (this is hypothetical as MatrixUtils does not have such a method)

        System.out.println("Read Diagonal:");
        for (double value : readDiagonal) {
            System.out.print(value + " ");
        }
    }
    
    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}