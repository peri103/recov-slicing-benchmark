import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with one column
        double[][] matrixData = {{0}, {0}, {0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column RealVector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{1, 2, 3});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Create another matrix and vector for additional complexity
        double[][] additionalMatrixData = {{4, 5}, {6, 7}, {8, 9}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);
        RealVector additionalVector = MatrixUtils.createColumnRealVector(new double[]{10, 11, 12});
        additionalMatrix.setColumnVector(1, additionalVector);

        // Perform operations on the additional matrix
        RealVector sumVector = additionalMatrix.getColumnVector(1).add(additionalMatrix.getColumnVector(0));
        System.out.println("Sum Vector: " + sumVector);

        // Retrieve the column RealVector
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println("Retrieved Vector: " + retrievedVector);

        // Perform further operations on the original matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix: ");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println(scaledMatrix.getRowVector(i));
        }

        // Additional operations on vectors
        RealVector multipliedVector = retrievedVector.mapMultiply(3.0);
        System.out.println("Multiplied Vector: " + multipliedVector);

        // Final operation to ensure complexity
        RealVector sumAllVectors = retrievedVector.add(multipliedVector).add(sumVector);
        System.out.println("Sum of All Vectors: " + sumAllVectors);
    }
}