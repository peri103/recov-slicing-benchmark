import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] vectorData = {4.0, 5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);

        // Additional operations with vectors
        RealVector vector1 = new ArrayRealVector(vectorData);
        RealVector vector2 = vector1.mapMultiply(2.0);  // Scale vector by 2
        RealVector vectorSum = vector1.add(vector2);    // Add two vectors

        System.out.println("Vector Sum:");
        for (int i = 0; i < vectorSum.getDimension(); i++) {
            System.out.println(vectorSum.getEntry(i));
        }

        // Additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = identityMatrix.add(matrix);  // Add identity matrix to the column matrix

        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}