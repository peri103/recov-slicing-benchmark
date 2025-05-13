import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        double[] vectorValues = {4.0, 5.0, 6.0};

        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createDiagonalMatrix(diagonalValues);

        RealVector resultVector = matrixOps.multiplyWithVector(vectorValues);

        double sum = 0.0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }

        System.out.println("Sum of elements in result vector: " + sum);

        RealMatrix addedMatrix = matrixOps.addIdentityMatrix();

        double[] readDiagonal = addedMatrix.getColumn(0);
        
        /* read */ for (double value : readDiagonal) {
            System.out.println(value);
        }

        Student student = new Student("Alice", new double[]{85.0, 90.0, 95.0});
        System.out.println("Student: " + student.getName());
        System.out.println("Average Grade: " + student.calculateAverage());
    }
}