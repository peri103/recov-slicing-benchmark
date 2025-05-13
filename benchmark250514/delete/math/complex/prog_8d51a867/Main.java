import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with a single column
        double[][] data = { {1.0}, {2.0}, {3.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Write: Create a column real vector and set it in the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Additional operations to make the program more complex
        // Create another matrix and perform operations
        double[][] data2 = { {7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0} };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        RealVector sumVector = new ArrayRealVector(matrix2.getRowDimension());
        
        // Sum rows of the second matrix
        for (int i = 0; i < matrix2.getRowDimension(); i++) {
            sumVector = sumVector.add(matrix2.getRowVector(i));
        }
        
        System.out.println("Sum of rows in matrix2: " + sumVector);

        // Read: Get the column real vector back from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Print the read vector to ensure it matches what was written
        System.out.println("Read column vector: " + readVector);

        // Create a new vector and perform element-wise multiplication
        RealVector multiplierVector = new ArrayRealVector(new double[]{2.0, 3.0, 4.0});
        RealVector resultVector = readVector.ebeMultiply(multiplierVector);
        
        System.out.println("Result of element-wise multiplication: " + resultVector);
    }
}