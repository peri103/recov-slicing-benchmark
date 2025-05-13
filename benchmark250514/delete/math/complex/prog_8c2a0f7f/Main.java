import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };
        
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = triangularMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform matrix addition with another matrix
        double[][] additionalData = {
            {0.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix sumMatrix = triangularMatrix.add(additionalMatrix);
        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some unrelated calculations
        double[] array = {2.0, 4.0, 6.0, 8.0, 10.0};
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
        
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);
        
        System.out.println("Retrieved Triangular Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}