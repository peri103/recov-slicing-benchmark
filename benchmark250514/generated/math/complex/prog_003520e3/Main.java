import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create a matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Perform operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        double[][] transposedData = transposedMatrix.getData();
        
        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for (double[] row : transposedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Create another matrix and perform addition
        double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RealMatrix sumMatrix = matrix.add(matrix2);
        
        // Print sum matrix
        System.out.println("Sum Matrix:");
        double[][] sumData = sumMatrix.getData();
        for (double[] row : sumData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Read the original matrix using the read method
        /* read */ double[][] readData = matrix.getData();
        
        // Print the original matrix
        System.out.println("Original Matrix:");
        for (double[] row : readData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Perform scalar multiplication
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        double[][] scaledData = scaledMatrix.getData();
        
        // Print scaled matrix
        System.out.println("Scaled Matrix:");
        for (double[] row : scaledData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}