import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class MatrixOperations {
    private RealMatrix matrix;

    public MatrixOperations(int rows, int cols) {
        this.matrix = new Array2DRowRealMatrix(rows, cols);
    }

    public void setEntry(int row, int col, double value) {
        matrix.setEntry(row, col, value);
    }

    public double[][] getTransposedData() {
        return matrix.transpose().getData();
    }

    public void printMatrix() {
        double[][] data = getTransposedData();
        System.out.println("Matrix values:");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
