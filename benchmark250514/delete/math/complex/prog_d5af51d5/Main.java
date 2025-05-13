import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixFormat;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealVectorFormat;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize data for ArrayRealVector
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a RealMatrix for demonstration
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new BlockRealMatrix(matrixData);
        
        // Format matrix and print
        RealMatrixFormat matrixFormat = new RealMatrixFormat();
        System.out.println("Matrix:");
        System.out.println(matrixFormat.format(matrix));
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        System.out.println(matrixFormat.format(transposedMatrix));
        
        // Create another RealVector using MatrixUtils
        double[] anotherData = {4.0, 5.0, 6.0};
        ArrayRealVector anotherVector = MatrixUtils.createArrayRealVector(anotherData);
        
        // Format vector and print
        RealVectorFormat vectorFormat = new RealVectorFormat();
        System.out.println("Another Vector:");
        System.out.println(vectorFormat.format(anotherVector));
        
        // Perform operations on vectors
        RealVector addedVector = anotherVector.add(new ArrayRealVector(data));
        System.out.println("Added Vector:");
        System.out.println(vectorFormat.format(addedVector));
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Perform more operations on the original vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        System.out.println(vectorFormat.format(scaledVector));
        
        // Perform subtraction with another vector
        RealVector subtractedVector = vector.subtract(anotherVector);
        System.out.println("Subtracted Vector:");
        System.out.println(vectorFormat.format(subtractedVector));
        
        // Read the original vector data
        /* read */ double[] readData = vector.toArray();
        
        // Print the read data
        System.out.println("Read Data:");
        for (double value : readData) {
            System.out.println(value);
        }
        
        // Perform dot product operation
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot Product:");
        System.out.println(dotProduct);
    }
}