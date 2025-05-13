import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Additional code for complexity
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        RealMatrix multipliedMatrix = matrix.multiply(MatrixUtils.createColumnRealMatrix(vectorData));
        
        double[][] additionalData = { {7.0, 8.0}, {9.0, 10.0} };
        RealMatrix additionalMatrix = MatrixUtils.createArray2DRowRealMatrix(additionalData);
        
        RealMatrix sumMatrix = matrix.add(additionalMatrix);
        
        // Further operations on matrices
        RealMatrix transposedMatrix = sumMatrix.transpose();
        RealVector resultVector = transposedMatrix.operate(vector);
        
        /* read */ double[][] readData = matrix.getData();
        
        for (double[] row : readData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Print the result of vector operation
        System.out.println("Result of vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}