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

        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Additional complex operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        double[][] anotherMatrixData = {
            {3.0, 2.0, 1.0},
            {6.0, 5.0, 4.0},
            {9.0, 8.0, 7.0}
        };
        
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix subtractedMatrix = matrix.subtract(anotherMatrix);
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        System.out.println("Read Column Vector: " + readColumnVector);
        
        double[] row = matrix.getRow(1);
        System.out.println("Second Row:");
        for (double value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}