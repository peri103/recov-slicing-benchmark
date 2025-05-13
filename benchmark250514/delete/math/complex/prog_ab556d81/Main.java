import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Additional RealMatrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix sumMatrix = matrix.add(identityMatrix);
        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);
        
        // RealVector operations
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result Vector:");
        printVector(resultVector);
        
        // Further complex operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        printMatrix(scaledMatrix);

        // Perform some matrix operations before reading
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        
        /* read */ double[][] block = matrix.getData();
        
        System.out.println("Original Matrix Block:");
        for (double[] row : block) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
    private static void printMatrix(RealMatrix matrix) {
        double[][] data = matrix.getData();
        for (double[] row : data) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
    private static void printVector(RealVector vector) {
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println();
    }
}