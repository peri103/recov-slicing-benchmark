import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initializing data for vector creation
        double[] data = {1.0, 2.0, 3.0};
        
        // Creating another vector for demonstration
        double[] data2 = {4.0, 5.0, 6.0};
        RealVector vector2 = MatrixUtils.createRealVector(data2);
        
        // Creating a matrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Performing operations on matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Using the original write method
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        
        // Performing calculations with vectors
        RealVector sumVector = vector.add(vector2);
        System.out.println("Sum of vectors:");
        System.out.println(sumVector);
        
        // Some unrelated calculations
        double scalar = 2.0;
        RealVector scaledVector = vector2.mapMultiply(scalar);
        System.out.println("Scaled Vector:");
        System.out.println(scaledVector);
        
        // Reading the vector created earlier
        /* read */ RealVector readVector = vector; // MatrixUtils does not have getRealVector, assuming direct access
        System.out.println("Read Vector:");
        System.out.println(readVector);
        
        // Further operations on the read vector
        double dotProduct = readVector.dotProduct(vector2);
        System.out.println("Dot Product:");
        System.out.println(dotProduct);
    }
}