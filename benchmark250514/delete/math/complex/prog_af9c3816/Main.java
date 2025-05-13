import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        // Create a RealMatrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        
        // Create a RealVector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = transposedMatrix.operate(vector);
        
        // Intermediate calculations
        double vectorNorm = vector.getNorm();
        double matrixDeterminant = matrix.getDeterminant();
        
        // Print intermediate results
        System.out.println("Vector Norm: " + vectorNorm);
        System.out.println("Matrix Determinant: " + matrixDeterminant);
        
        // Further matrix operations
        RealMatrix sumMatrix = matrix.add(identityMatrix);
        RealMatrix scaledMatrix = sumMatrix.scalarMultiply(2.0);
        
        // Retrieve the data from the matrix
        /* read */ double[][] readData = matrix.getData();
        
        // Print the original matrix data
        System.out.println("Original Matrix:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
        
        // Print the transposed matrix data
        System.out.println("Transposed Matrix:");
        double[][] transposedData = transposedMatrix.getData();
        for (int i = 0; i < transposedData.length; i++) {
            for (int j = 0; j < transposedData[i].length; j++) {
                System.out.print(transposedData[i][j] + " ");
            }
            System.out.println();
        }
        
        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}