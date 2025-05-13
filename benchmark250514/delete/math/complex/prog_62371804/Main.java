import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});

        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // Perform additional operations to make the program more complex
        RealMatrix matrixB = new Array2DRowRealMatrix(new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}});
        RealMatrix resultMatrix = matrix.multiply(matrixB);
        
        RealVector vectorA = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector vectorB = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector vectorC = vectorA.add(vectorB);
        
        System.out.println("Resulting Matrix after multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Resulting Vector after addition:");
        for (int i = 0; i < vectorC.getDimension(); i++) {
            System.out.print(vectorC.getEntry(i) + " ");
        }
        System.out.println();

        // Read the column vector from the matrix using the read method
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the read vector
        System.out.println("Read Vector:");
        System.out.println(readVector);
    }
}