public class Main {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        double[][] matrixData1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] matrixData2 = {{5.0, 6.0}, {7.0, 8.0}};
        matrixOps.printTransposedMatrix(matrixData1);
        matrixOps.printSumMatrix(matrixData1, matrixData2);

        // Sparse vector operations
        SparseVectorManager vectorManager = new SparseVectorManager();
        vectorManager.createSparseVector(new double[]{1.0, 2.0, 3.0});
        
        // Reading the sparse vector
        RealVector readVector = /* read */ vectorManager.getSparseVector();
        System.out.println("Read Vector: " + readVector);
    }
}