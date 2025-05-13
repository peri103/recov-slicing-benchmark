import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        MatrixOperations matrixOps = new MatrixOperations(matrixData);
        matrixOps.setColumnVector(0, new double[]{10.0, 11.0, 12.0});

        MatrixReader matrixReader = new MatrixReader(matrixOps.getMatrix());
        RealVector readColumnVector = matrixReader.getColumnVector(0);
        System.out.println("Read Column Vector: " + readColumnVector);

        double[][] studentGrades = {
            {85.0, 90.0, 95.0},
            {80.0, 85.0, 90.0},
            {75.0, 80.0, 85.0}
        };

        Student student = new Student("John Doe", studentGrades);
        System.out.println("Student Name: " + student.getName());
        double[][] grades = student.getGrades();
        System.out.println("Student Grades:");
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}