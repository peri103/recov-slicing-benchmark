import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        matrixOps.setMatrixEntry(1, 1, 5.0);

        BlockRealMatrix matrix2 = new BlockRealMatrix(3, 3);
        matrix2.setEntry(0, 0, 2.0);
        matrix2.setEntry(0, 1, 4.0);
        matrix2.setEntry(0, 2, 6.0);
        matrix2.setEntry(1, 0, 8.0);
        matrix2.setEntry(1, 1, 10.0);
        matrix2.setEntry(1, 2, 12.0);
        matrix2.setEntry(2, 0, 14.0);
        matrix2.setEntry(2, 1, 16.0);
        matrix2.setEntry(2, 2, 18.0);

        RealMatrix resultMatrix = matrixOps.addMatrices(matrix2);
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        RealMatrix multipliedMatrix = matrixOps.multiplyMatrices(matrix2);
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ double value = matrixOps.getMatrixEntry(1, 1);
        System.out.println("Read value: " + value);

        // Student operations
        Student student = new Student("Alice");
        student.addGrade(95.0);
        student.addGrade(89.5);
        student.addGrade(76.0);

        System.out.println("Grades for " + student.getName() + ":");
        List<Double> grades = student.getGrades();
        for (double grade : grades) {
            System.out.println(grade);
        }
    }
}