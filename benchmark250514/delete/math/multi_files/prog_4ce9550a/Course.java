public class Course {
    private String name;
    private MatrixOperations matrixOps;

    public Course(String name) {
        this.name = name;
        this.matrixOps = new MatrixOperations();
    }

    public void initializeMatrix(double[][] data) {
        matrixOps.createSymmetricMatrix(data);
    }

    public RealMatrix getCourseMatrix() {
        return matrixOps.getSymmetricMatrix();
    }
}
