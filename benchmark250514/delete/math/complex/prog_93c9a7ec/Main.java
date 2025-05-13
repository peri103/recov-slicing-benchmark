import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with a single column
        double[][] matrixData = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column real vector and set it to the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Additional unrelated matrix operations to increase complexity
        double[][] additionalMatrixData = {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);
        
        // Add the two matrices
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform scalar multiplication
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get the column real vector from the matrix
        /* read */ RealVector retrievedColumnVector = matrix.getColumnVector(0);

        // Print the retrieved column vector
        System.out.println("Retrieved Column Vector:");
        System.out.println(retrievedColumnVector);
    }
}