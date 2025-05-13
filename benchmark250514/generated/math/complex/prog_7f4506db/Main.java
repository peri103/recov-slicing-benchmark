import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createRealMatrix(data);

        // Additional unrelated code to make the program more complex
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealMatrix matrixIdentity = MatrixUtils.createRealIdentityMatrix(3);
        
        RealVector multipliedVector = matrixIdentity.operate(vector);
        System.out.println("Vector after identity matrix multiplication:");
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.print(multipliedVector.getEntry(i) + " ");
        }
        System.out.println();

        double[][] anotherData = {
            {7, 8, 9},
            {8, 10, 11},
            {9, 11, 12}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(anotherData);
        RealMatrix addedMatrix = symmetricMatrix.add(anotherMatrix);

        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve and print the original symmetric matrix
        /* read */ RealMatrix retrievedMatrix = symmetricMatrix;
        
        System.out.println("Retrieved symmetric matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}