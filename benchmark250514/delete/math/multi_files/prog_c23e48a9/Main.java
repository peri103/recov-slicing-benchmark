import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 3);
        student.setScores(new double[]{85.0, 90.0, 95.0});
        
        // Perform some operations
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealVector studentScores = student.getScores();
        System.out.println("Student Scores: " + studentScores);
        
        // Extract the original column vector
        /* read */ RealVector readScores = studentScores;
        
        System.out.println("Read Scores: " + readScores);
    }
}