import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};
        
        /* write */ 
        RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Perform some operations on the vector
        RealVector additionalVector = MatrixUtils.createSparseRealVector(additionalData);
        RealVector sumVector = vector.add(additionalVector);
        
        // Create a matrix and perform operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealVector matrixRow = matrix.getRowVector(1);
        RealVector resultVector = matrixRow.ebeMultiply(sumVector);
        
        // Use the original vector in some calculation
        double norm = vector.getNorm();
        System.out.println("Norm of the original vector: " + norm);

        // Perform a transformation on the resultVector
        RealVector transformedVector = resultVector.mapMultiply(2.0);
        
        // More operations on vectors
        double dotProduct = transformedVector.dotProduct(additionalVector);
        System.out.println("Dot product of transformed and additional vector: " + dotProduct);

        // Retrieve the original vector
        /* read */ 
        RealVector readVector = MatrixUtils.getSparseRealVector(vector);
        
        System.out.println("Read vector: " + readVector);

        // Final operations
        RealVector scaledVector = readVector.mapMultiply(3.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}