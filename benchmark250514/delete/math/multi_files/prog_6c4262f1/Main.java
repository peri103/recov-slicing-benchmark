public class Main {
    public static void main(String[] args) {
        // Vector operations
        double[] data = {1.0, 2.0, 3.0};
        RealVectorOperations vectorOps = new RealVectorOperations();
        vectorOps.createVector(data);

        // Matrix operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        MatrixOperations matrixOps = new MatrixOperations(matrixData);
        RealMatrix transposedMatrix = matrixOps.transposeMatrix();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Reading the vector created earlier
        /* read */ RealVector readVector = vectorOps.getVector();
        System.out.println("Read Vector:");
        System.out.println(readVector);

        // Further operations on the read vector
        double[] data2 = {4.0, 5.0, 6.0};
        RealVector vector2 = MatrixUtils.createRealVector(data2);
        double dotProduct = readVector.dotProduct(vector2);
        System.out.println("Dot Product:");
        System.out.println(dotProduct);
    }
}