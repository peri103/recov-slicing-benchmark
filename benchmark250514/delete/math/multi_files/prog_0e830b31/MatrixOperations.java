import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class MatrixOperations {
    private OpenMapRealMatrix complexMatrix;

    public MatrixOperations(int rows, int columns) {
        complexMatrix = new OpenMapRealMatrix(rows, columns);
    }

    public void modifyComplexMatrix() {
        complexMatrix.setEntry(0, 1, 5.0);
        complexMatrix.setEntry(1, 2, 3.0);
    }

    public void printMultipliedMatrix() {
        RealMatrix multipliedMatrix = complexMatrix.scalarMultiply(2.0);
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }

    public void printTransposedMatrix(RealMatrix matrix) {
        RealMatrix transposedMatrix = matrix.transpose();
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}
