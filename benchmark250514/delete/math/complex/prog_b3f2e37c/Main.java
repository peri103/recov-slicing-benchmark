import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        // Initialize data for vector
        double[] vectorData = {5.0, 6.0};
        
        // Create a vector using ArrayRealVector
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform operations on vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Create another matrix and perform operations
        RealMatrix anotherMatrix = MatrixUtils.createArray2DRowRealMatrix(new double[][]{{7.0, 8.0}, {9.0, 10.0}});
        RealMatrix multipliedMatrix = anotherMatrix.multiply(MatrixUtils.createArray2DRowRealMatrix(data));
        
        // Display the scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Display the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Original write operation
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Perform matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Original read operation
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Display the retrieved data
        System.out.println("Retrieved Data:");
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}