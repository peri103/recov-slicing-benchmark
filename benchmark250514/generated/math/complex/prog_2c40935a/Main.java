import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        // Creating a matrix using the original write method
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Adding unrelated operations to make the program more complex
        double[] columnData = {4.0, 5.0, 6.0};
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Adding matrices
        RealMatrix sumMatrix = matrix.add(columnMatrix.transpose());
        
        // Creating a vector and performing operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector resultVector = vector.mapAdd(1.0);

        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Performing matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(columnMatrix);

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Reading the matrix using the original read method
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);

        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}