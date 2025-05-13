import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Initialize another matrix
        RealMatrix otherMatrix = MatrixUtils.createColumnRealMatrix(new double[]{4.0, 5.0, 6.0});
        
        // Perform some operations on the other matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector resultVector = otherMatrix.operate(vector);
        
        // Print results from operations on the other matrix
        System.out.println("Resulting vector from otherMatrix operations:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform additional operations on the first matrix
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Calculate the sum of entries in the transposed matrix
        double sum = 0.0;
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                sum += transposedMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of entries in the transposed matrix: " + sum);
        
        /* read */ RealMatrix readMatrix = matrix.getColumnMatrix(0);
        
        // Print the read matrix
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }
        
        // Perform another operation unrelated to matrices
        int[] numbers = {10, 20, 30, 40, 50};
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total sum of numbers array: " + total);
    }
}