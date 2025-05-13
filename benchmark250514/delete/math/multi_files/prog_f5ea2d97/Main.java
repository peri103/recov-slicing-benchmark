import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] initialData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        MatrixOperations matrixOps = new MatrixOperations(initialData);
        
        double[] newRowData = {10.0, 11.0, 12.0};
        matrixOps.modifyRow(0, newRowData);
        
        // Additional complex operations
        double[][] anotherMatrixData = {
            {9.0, 8.0, 7.0},
            {6.0, 5.0, 4.0},
            {3.0, 2.0, 1.0}
        };

        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix resultMatrix = matrixOps.addMatrix(anotherMatrix);

        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        Student student = new Student("John", initialData);
        System.out.println("Student Name: " + student.getName());

        // Finally, read the modified row vector from the matrix
        /* read */ RealVector readVector = matrixOps.getRow(0);
        System.out.println("Modified row vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}