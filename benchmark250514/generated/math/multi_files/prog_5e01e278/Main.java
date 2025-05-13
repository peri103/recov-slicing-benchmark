import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        double[] vectorData = {5.0, 6.0};

        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(data);

        double[] vectorProduct = matrixOps.operate(vectorData);
        System.out.println("Vector Product:");
        for (double value : vectorProduct) {
            System.out.print(value + " ");
        }
        System.out.println();

        double[][] additionalData = {
            {7.0, 8.0},
            {9.0, 10.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix sumMatrix = matrixOps.addMatrix(additionalMatrix);

        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = matrixOps.getMatrix();

        System.out.println("Original Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        Student student = new Student("Alice");
        student.addGrade(95.0);
        student.addGrade(88.5);
        System.out.println(student.getName() + "'s Grades: " + student.getGrades());
    }
}