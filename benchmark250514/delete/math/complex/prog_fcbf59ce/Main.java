import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initializing data for vector creation
        double[] data = {1.0, 2.0, 3.0};
        
        // Creating a 3x3 matrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Creating a matrix using BlockRealMatrix
        RealMatrix matrix = new BlockRealMatrix(matrixData);

        // Performing matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Creating and manipulating vectors
        ArrayRealVector vector1 = MatrixUtils.createArrayRealVector(data);
        ArrayRealVector vector2 = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        
        // Adding vectors
        RealVector addedVector = vector1.add(vector2);
        
        // Subtracting vectors
        RealVector subtractedVector = vector1.subtract(vector2);

        // Performing dot product
        double dotProduct = vector1.dotProduct(vector2);
        
        // Performing scalar multiplication
        RealVector scaledVector = vector1.mapMultiply(2.0);
        
        // Writing the original vector using MatrixUtils
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Performing operations on the vector
        double norm = vector.getNorm();
        double[] vectorData = vector.toArray();
        
        // Retrieving the original vector using MatrixUtils
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);
        
        // Output the retrieved vector to verify
        System.out.println(retrievedVector);

        // Output additional results for complexity
        System.out.println("Added Vector: " + addedVector);
        System.out.println("Subtracted Vector: " + subtractedVector);
        System.out.println("Dot Product: " + dotProduct);
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Matrix Transpose: " + transposedMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);
        System.out.println("Vector Norm: " + norm);
    }
}