import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a column real matrix from the data array
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);

        // Additional matrix manipulation
        double[][] additionalData = {{4.0, 5.0}, {6.0, 7.0}, {8.0, 9.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix.multiply(additionalMatrix);
        
        // Print the result of the multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Retrieve the column real matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the column matrix
        System.out.println("Column matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
        
        // More unrelated logic
        double[][] randomData = {{10.0, 11.0}, {12.0, 13.0}};
        RealMatrix randomMatrix = new Array2DRowRealMatrix(randomData);
        
        // Perform another matrix operation
        RealMatrix finalMatrix = resultMatrix.add(randomMatrix);
        
        // Print the final matrix
        System.out.println("Final matrix after addition:");
        for (int i = 0; i < finalMatrix.getRowDimension(); i++) {
            for (int j = 0; j < finalMatrix.getColumnDimension(); j++) {
                System.out.print(finalMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}