import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] columnData = {4.0, 5.0, 6.0};

        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(rowData);

        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        RealMatrix sumMatrix = matrixOps.addMatrices(columnMatrix.transpose());

        RealVector scaledVector = matrixOps.scaleVector(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        RealMatrix productMatrix = matrixOps.multiplyMatrices(columnMatrix.transpose());
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        MatrixReader matrixReader = new MatrixReader(matrixOps.getMatrix());
        matrixReader.printMatrix();
    }
}