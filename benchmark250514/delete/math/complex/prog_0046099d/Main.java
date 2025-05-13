import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create another vector for additional operations
        double[] additionalData = {4.0, 5.0, 6.0};
        ArrayRealVector additionalVector = new ArrayRealVector(additionalData);
        
        // Perform some operations with the additional vector
        RealVector sumVector = additionalVector.mapAdd(10.0);

        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform operations on the original vector
        RealVector scaledVector = vector.mapMultiply(2.0);

        // Create a matrix and perform operations
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Add the scaled vector to the matrix
        RealMatrix resultMatrix = matrix.add(scaledVector.outerProduct(additionalVector));

        // Print the result of matrix operations
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform more operations on the sumVector
        RealVector normalizedVector = sumVector.mapDivide(2.0);

        /* read */ double[] readData = vector.toArray();
        
        System.out.println("Original Vector:");
        for (double value : readData) {
            System.out.println(value);
        }

        // Print the normalized vector
        System.out.println("Normalized Vector:");
        for (double value : normalizedVector.toArray()) {
            System.out.println(value);
        }
    }
}