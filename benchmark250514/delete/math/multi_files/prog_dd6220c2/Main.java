import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonal = {1.0, 2.0, 3.0};
        
        DiagonalMatrixHandler handler = new DiagonalMatrixHandler();
        handler.createMatrix(diagonal);
        
        RealMatrix matrix = handler.getMatrix();
        
        MatrixOperations operations = new MatrixOperations(matrix);
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector resultVector = operations.operateVector(vectorData);

        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        RealMatrix transposedMatrix = operations.getTransposedMatrix();
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        /* read */ double[] extractedDiagonal = matrix.getColumn(0);
        
        System.out.println("Extracted diagonal:");
        for (double value : extractedDiagonal) {
            System.out.println(value);
        }
    }
}