import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one column
        double[][] matrixData = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column real vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Additional complex operations
        double[][] additionalMatrixData = {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);
        
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        RealVector sumVector = columnVector.add(MatrixUtils.createColumnRealVector(new double[]{1.0, 1.0, 1.0}));
        System.out.println("Sum Vector: " + sumVector);

        // Read the column real vector from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Print the read vector
        System.out.println("Read Vector: " + readVector);
        
        // More complex operations
        RealVector multipliedVector = readVector.mapMultiply(2.0);
        System.out.println("Multiplied Vector: " + multipliedVector);

        double dotProduct = readVector.dotProduct(multipliedVector);
        System.out.println("Dot Product: " + dotProduct);
    }
}