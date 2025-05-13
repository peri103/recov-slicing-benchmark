import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Perform some operations on vectors
        RealVector anotherVector = MatrixUtils.createArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = vector.add(anotherVector);
        System.out.println("Sum of vectors: " + sumVector);

        // Create and manipulate a matrix
        double[][] matrixData = { {1.0, 2.0}, {3.0, 4.0} };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Scale the original vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Use the original write-read pair
        /* read */ RealVector readVector = vector; // Assuming getArrayRealVector is a method to retrieve the vector itself
        System.out.println("Original Vector: " + readVector);
    }
}