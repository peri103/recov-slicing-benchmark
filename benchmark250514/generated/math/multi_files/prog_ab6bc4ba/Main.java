import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        MatrixOperations matrixOps = new MatrixOperations(data);
        
        // Transpose the matrix
        RealMatrix transposedMatrix = matrixOps.transposeMatrix();
        System.out.println("Transposed matrix:");
        MatrixPrinter.printMatrix(transposedMatrix);
        
        // Multiply the matrix with its transpose
        RealMatrix multipliedMatrix = matrixOps.multiplyWith(transposedMatrix);
        System.out.println("Multiplied matrix:");
        MatrixPrinter.printMatrix(multipliedMatrix);
        
        // Retrieve the original matrix data
        RealMatrix matrix = matrixOps.getMatrix();
        /* read */ double[][] retrievedData = matrix.getData();
        
        System.out.println("Original matrix data:");
        MatrixPrinter.printData(retrievedData);
    }
}