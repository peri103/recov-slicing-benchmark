public class Main {
    public static void main(String[] args) {
        SymmetricMatrixHandler matrixHandler = new SymmetricMatrixHandler(3);
        matrixHandler.setMatrixEntry(0, 1, 5.0);

        MatrixOperations matrixOperations = new MatrixOperations(3, 3);
        matrixOperations.fillMatrix();
        RealMatrix transposedMatrix = matrixOperations.transposeMatrix();
        
        System.out.println("Transposed Matrix:");
        matrixOperations.printMatrix(transposedMatrix);

        SymmetricMatrix matrix = matrixHandler.getMatrix();
        /* read */ double value = matrix.getEntry(0, 1);
        System.out.println("Symmetric Matrix Entry (0,1): " + value);

        matrix.setEntry(1, 2, 10.0);
        double anotherValue = matrix.getEntry(1, 2);
        System.out.println("Symmetric Matrix Entry (1,2): " + anotherValue);

        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = i; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of Symmetric Matrix Entries: " + sum);
    }
}