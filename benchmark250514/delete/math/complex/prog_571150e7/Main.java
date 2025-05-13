import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles
        double[] data = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a RealVector from the array
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);

        // Additional operations on vectors
        double[] data2 = {4.0, 5.0, 6.0};
        RealVector vector2 = MatrixUtils.createArrayRealVector(data2);
        RealVector sumVector = vector.add(vector2);
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Matrix operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform some calculations
        double dotProduct = vector.dotProduct(vector2);
        System.out.println("Dot product of vector and vector2: " + dotProduct);

        // Use MatrixUtils to retrieve the RealVector (though typically you'd just use the vector directly)
        /* read */ RealVector retrievedVector = MatrixUtils.createArrayRealVector(vector.toArray());

        // Print the values of the retrieved vector
        System.out.println("Retrieved vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}