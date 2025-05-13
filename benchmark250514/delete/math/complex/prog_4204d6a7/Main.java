import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixImpl;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Initialize a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new RealMatrixImpl(matrixData);
        
        // Perform operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        
        // Perform vector operations
        ArrayRealVector vector1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        ArrayRealVector vector2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        
        ArrayRealVector sumVector = vector1.add(vector2);
        System.out.println("Sum of vectors:");
        printVector(sumVector);
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Additional operations
        ArrayRealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        printVector(scaledVector);
        
        // More complex operations
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        printMatrix(multipliedMatrix);
        
        /* read */ double[] retrievedData = vector.toArray();
        
        System.out.println("Retrieved Data:");
        for (double value : retrievedData) {
            System.out.println(value);
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
    
    private static void printVector(ArrayRealVector vector) {
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println();
    }
}