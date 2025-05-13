import org.apache.commons.math3.linear.RealMatrix;

public class MatrixReader {
    private RealMatrix matrix;

    public MatrixReader(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
    }
}
