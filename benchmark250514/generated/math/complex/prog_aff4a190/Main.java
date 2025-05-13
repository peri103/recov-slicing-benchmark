import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };

        /* write */
        RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix for demonstration purposes
        double[][] additionalData = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        // Perform some operations on the additional matrix
        RealMatrix multipliedMatrix = additionalMatrix.scalarMultiply(2);
        double[][] multipliedData = multipliedMatrix.getData();

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedData.length; i++) {
            for (int j = 0; j < multipliedData[i].length; j++) {
                System.out.print(multipliedData[i][j] + " ");
            }
            System.out.println();
        }

        // Now read the original triangular matrix data
        /* read */
        double[][] readData = triangularMatrix.getData();

        System.out.println("Original Triangular Matrix:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}