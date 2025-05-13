public class Main {
    public static void main(String[] args) {
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        MatrixOperations matrixOperations = new MatrixOperations(data);
        MatrixReader matrixReader = new MatrixReader(matrixOperations);

        // Perform some matrix operations
        RealMatrix transposedMatrix = matrixOperations.transposeMatrix();
        RealMatrix multipliedMatrix = matrixOperations.multiplyMatrix(transposedMatrix);
        RealMatrix addedMatrix = matrixOperations.addMatrix(transposedMatrix);
        RealMatrix subtractedMatrix = matrixOperations.subtractMatrix(transposedMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read and print the matrix
        RealMatrix readMatrix = matrixReader.readMatrix();
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}