import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Replace the first column of the matrix with the new column vector
        matrix.setColumnVector(0, columnVector);

        // Read the column vector using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the values of the read column vector
        System.out.println("Read Column Vector:");
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
    }
}