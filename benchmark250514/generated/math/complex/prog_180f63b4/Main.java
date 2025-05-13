import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData1 = {1.0, 2.0, 3.0};
        double[] rowData2 = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData1);
        
        // Perform some unrelated operations with vectors
        RealVector vector1 = new ArrayRealVector(rowData1);
        RealVector vector2 = new ArrayRealVector(rowData2);
        RealVector sumVector = vector1.add(vector2);
        
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.print(sumVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix multiplication with another matrix
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(rowData2);
        RealMatrix productMatrix = matrix.multiply(anotherMatrix.transpose());
        
        System.out.println("Product matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix rowMatrix = matrix.getRowMatrix(0);
        
        System.out.println("Row matrix:");
        for (int i = 0; i < rowMatrix.getColumnDimension(); i++) {
            System.out.print(rowMatrix.getEntry(0, i) + " ");
        }
    }
}