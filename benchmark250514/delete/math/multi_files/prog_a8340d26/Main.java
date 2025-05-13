import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        MatrixOperations matrixOps = new MatrixOperations(data);
        double[] newRowData = {10.0, 11.0, 12.0};
        matrixOps.setRowVector(0, newRowData);

        RealMatrix matrix = matrixOps.getMatrix();
        MatrixReader matrixReader = new MatrixReader(matrix);
        RealVector readRowVector = matrixReader.getRowVector(0);

        System.out.println("Read Row Vector:");
        System.out.println(readRowVector);
    }
}