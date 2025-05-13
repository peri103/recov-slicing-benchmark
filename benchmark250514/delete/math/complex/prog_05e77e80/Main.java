import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Additional operations with RealVector
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Operations on matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);

        // Printing scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Operations using matrix
        RealMatrix addedMatrix = multipliedMatrix.add(identityMatrix);

        // Operations with another matrix
        double[] anotherRowData = {7.0, 8.0, 9.0};
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRowData);
        RealMatrix subtractedMatrix = addedMatrix.subtract(anotherMatrix);

        // Printing subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Printing retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}