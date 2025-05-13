import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ SparseRealVector vector = MatrixUtils.createSparseRealVector(data);
        
        // Additional unrelated code to make the program more complex
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealVector columnVector = matrix.getColumnVector(0);
        RealVector rowVector = matrix.getRowVector(1);
        
        double dotProduct = columnVector.dotProduct(rowVector);
        System.out.println("Dot Product of column and row vectors: " + dotProduct);
        
        RealVector scaledVector = columnVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
        
        // Perform some operations on the original vector
        double sum = 0.0;
        for (int i = 0; i < vector.getDimension(); i++) {
            sum += vector.getEntry(i);
        }
        System.out.println("Sum of vector entries: " + sum);
        
        // More operations
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);
        
        // Now read the original vector
        /* read */ RealVector readVector = vector;
        
        System.out.println("Vector: " + readVector);
    }
}