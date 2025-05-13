import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create another vector using a different method
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{4.0, 5.0, 6.0});
        
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        
        // Perform some operations on the vectors
        RealVector sumVector = vector.add(anotherVector);
        RealVector scaledVector = anotherVector.mapMultiply(2.0);

        // Create a matrix and perform operations
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Output some results
        System.out.println("Sum Vector: " + sumVector);
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Transposed Matrix: " + transposedMatrix);

        /* read */ RealVector readVector = vector;
        
        System.out.println("Read Vector: " + readVector);
        
        // Further operations
        RealVector differenceVector = vector.subtract(anotherVector);
        System.out.println("Difference Vector: " + differenceVector);
        
        // Create a new matrix and perform operations
        double[][] newMatrixData = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrix newMatrix = new Array2DRowRealMatrix(newMatrixData);
        RealMatrix productMatrix = matrix.multiply(newMatrix);
        
        // Output more results
        System.out.println("Product Matrix: " + productMatrix);
    }
}