import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        double[] rowData = {10.0, 11.0, 12.0};
        /* write */ matrix.setRowVector(0, MatrixUtils.createRowRealVector(rowData));
        
        // Additional complex operations
        double[][] anotherMatrixData = {
            {9.0, 8.0, 7.0},
            {6.0, 5.0, 4.0},
            {3.0, 2.0, 1.0}
        };
        
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Some unrelated calculations
        double[] vectorData = {2.0, 3.0, 4.0};
        RealVector vector = MatrixUtils.createRealVector(vectorData);
        RealVector resultVector = vector.mapMultiply(2.0);

        System.out.println("Scaled vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Finally, read the modified row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Modified row vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}