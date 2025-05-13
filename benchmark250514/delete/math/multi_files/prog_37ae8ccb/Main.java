public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        VectorOperations vectorOps = new VectorOperations();
        vectorOps.initializeVector(data);

        RealVector vector = vectorOps.getVector();
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(vector);
        
        RealMatrix multipliedMatrix = matrixOps.multiplyMatrix();
        System.out.println("Multiplied Matrix:");
        matrixOps.printMatrix();

        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        /* read */ RealVector readVector = vectorOps.getVector();
        
        System.out.println("Read Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();

        RealVector scaledVector = vectorOps.scaleVector(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}