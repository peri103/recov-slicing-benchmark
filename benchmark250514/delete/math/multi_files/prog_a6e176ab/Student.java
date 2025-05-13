import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Student {
    private String name;
    private MatrixOperations grades;

    public Student(String name, double[][] initialGrades) {
        this.name = name;
        this.grades = new MatrixOperations(initialGrades);
    }

    public void updateGrades(int row, double[] newGrades) {
        RealVector vector = MatrixUtils.createRowRealVector(newGrades);
        grades.setRowVector(row, vector);
    }

    public RealVector getGrades(int row) {
        return grades.getRowVector(row);
    }

    public void printGrades() {
        System.out.println("Grades for " + name + ":");
        grades.printMatrix();
    }
}
