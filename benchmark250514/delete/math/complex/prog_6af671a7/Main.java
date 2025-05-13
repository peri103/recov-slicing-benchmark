import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a matrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Perform some matrix operations
        RealVector columnVector = matrix.getColumnVector(0);
        System.out.println("Column vector: " + columnVector);

        // Vector operations
        RealVector randomVector = new ArrayRealVector(new double[]{0.5, 1.5, 2.5});
        RealVector addedVector = randomVector.add(columnVector);
        System.out.println("Added vector: " + addedVector);
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // More unrelated computations
        double scalar = 2.0;
        RealVector scaledVector = vector.mapMultiply(scalar);
        System.out.println("Scaled vector: " + scaledVector);
        
        // Further operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix: " + transposedMatrix);
        
        /* read */ double[] readData = vector.toArray();
        
        // Print the read data
        for (double v : readData) {
            System.out.println(v);
        }
        
        // Additional complex operations
        RealVector subtractedVector = scaledVector.subtract(randomVector);
        System.out.println("Subtracted vector: " + subtractedVector);
    }
}