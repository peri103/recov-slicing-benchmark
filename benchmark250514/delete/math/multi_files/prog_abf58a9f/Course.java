public class Course {
    private String courseName;
    private MatrixOperations matrixOperations = new MatrixOperations();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setTriangularMatrix(double[][] data) {
        matrixOperations.createTriangularMatrix(data);
    }

    public RealMatrix getTriangularMatrix() {
        return matrixOperations.getTriangularMatrix();
    }

    public String getCourseName() {
        return courseName;
    }
}
