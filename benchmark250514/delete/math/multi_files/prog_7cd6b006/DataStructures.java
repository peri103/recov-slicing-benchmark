import org.apache.commons.math3.linear.RealMatrix;

public class DataStructures {
    private MatrixOperations matrixOps;

    public DataStructures(int rows, int columns) {
        this.matrixOps = new MatrixOperations(rows, columns);
    }

    public void initializeMatrix() {
        for (int i = 0; i < matrixOps.getMatrix().getRowDimension(); i++) {
            for (int j = 0; j < matrixOps.getMatrix().getColumnDimension(); j++) {
                matrixOps.setMatrixEntry(i, j, i + j + 1.0);
            }
        }
    }

    public void displayTransposedMatrix() {
        RealMatrix transposedMatrix = matrixOps.getTransposedMatrix();
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }

    public double getSumOfEntries() {
        return matrixOps.calculateSum();
    }

    public MatrixOperations getMatrixOperations() {
        return matrixOps;
    }
}
