import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations();
        double[] data = {1.0, 2.0, 3.0};
        vectorOps.createVector(data);

        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        MatrixOperations matrixOps = new MatrixOperations();
        RealMatrix transposedMatrix = matrixOps.transposeMatrix(matrixData);

        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */
        ArrayRealVector readVector = vectorOps.getVector();
        
        System.out.println("Read Vector: " + readVector);
        
        double[] readVectorData = readVector.toArray();
        for (double val : readVectorData) {
            System.out.println("Value from read vector: " + val);
        }
    }
}