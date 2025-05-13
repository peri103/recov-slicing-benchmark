public class Course {
    private String courseName;
    private MatrixOperations matrixOps = new MatrixOperations();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseMatrix(double[][] data) {
        matrixOps.createTriangularMatrix(data);
    }

    public RealMatrix getCourseMatrix() {
        return matrixOps.getTriangularMatrix();
    }
}
