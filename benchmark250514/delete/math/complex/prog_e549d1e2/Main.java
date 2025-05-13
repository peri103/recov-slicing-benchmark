import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};

        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);

        // Unrelated code to make the program more complex
        double[][] data = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data);
        RealMatrix sumMatrix = matrix.add(matrix2);

        // Performing operations on sumMatrix
        double[][] sumData = sumMatrix.getData();
        for (int i = 0; i < sumData.length; i++) {
            for (int j = 0; j < sumData[i].length; j++) {
                System.out.print(sumData[i][j] + " ");
            }
            System.out.println();
        }

        // More unrelated code
        double determinant = matrix2.getDeterminant();
        System.out.println("Determinant of matrix2: " + determinant);

        // Back to the original task
        /* read */ double[] readDiagonal = matrix.getColumn(0);

        for (double value : readDiagonal) {
            System.out.println(value);
        }
    }
}