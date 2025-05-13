import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};

        // Create another vector for additional operations
        double[] data2 = {4.0, 5.0, 6.0};
        RealVector vector2 = MatrixUtils.createRealVector(data2);

        /* write */ SparseRealVector vector = (SparseRealVector) MatrixUtils.createSparseRealVector(data);
        
        // Perform some operations on vector2
        RealVector addedVector = vector2.mapAdd(10);
        System.out.println("Added Vector: " + addedVector);

        // Create a matrix and perform operations
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix: " + transposedMatrix);

        // Use the original vector in some calculations
        RealVector scaledVector = vector.mapMultiply(2);
        System.out.println("Scaled Vector: " + scaledVector);

        // More operations on vector2
        RealVector subtractedVector = vector2.mapSubtract(1);
        System.out.println("Subtracted Vector: " + subtractedVector);

        /* read */ RealVector readVector = vector;
        
        System.out.println("Original Sparse Vector: " + readVector);
    }
}