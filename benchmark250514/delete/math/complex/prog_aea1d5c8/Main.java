import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Additional complex operations with matrices
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        
        double[][] additionalData = {{5.0, 6.0}, {7.0, 8.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix addedMatrix = multipliedMatrix.add(anotherMatrix);
        
        // Manipulate the matrices further
        double determinant = addedMatrix.getDeterminant();
        System.out.println("Determinant of the added matrix: " + determinant);
        
        RealMatrix subMatrix = addedMatrix.getSubMatrix(0, 1, 0, 1);
        
        // Continue with unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);
        
        // More matrix operations
        RealMatrix transposedMatrix = addedMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the original data from the matrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        System.out.println("Original matrix data:");
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}