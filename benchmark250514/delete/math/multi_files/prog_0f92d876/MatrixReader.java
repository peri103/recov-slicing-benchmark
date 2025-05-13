import org.apache.commons.math3.linear.RealMatrix;

public class MatrixReader {
    private MatrixOperations matrixOperations;

    public MatrixReader(MatrixOperations matrixOperations) {
        this.matrixOperations = matrixOperations;
    }

    public RealMatrix readMatrix() {
        /* read */ return matrixOperations.getMatrix().getSubMatrix(0, 1, 0, 1); // This will read the entire matrix as a submatrix
    }
}
