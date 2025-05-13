import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    private SparseMatrixHandler sparseMatrixHandler;
    private RealMatrix denseMatrix;

    public MatrixOperations(SparseMatrixHandler sparseMatrixHandler, double[][] denseData) {
        this.sparseMatrixHandler = sparseMatrixHandler;
        this.denseMatrix = MatrixUtils.createRealMatrix(denseData);
    }

    public RealMatrix performMatrixAddition() {
        return denseMatrix.add(sparseMatrixHandler.getSparseMatrix());
    }

    public RealVector performVectorOperation() {
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        return denseMatrix.operate(vector);
    }
}
