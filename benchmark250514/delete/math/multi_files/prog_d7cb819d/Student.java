public class Student {
    private String name;
    private MatrixHandler matrixHandler = new MatrixHandler();

    public Student(String name) {
        this.name = name;
    }

    public void createSparseMatrix(double[][] data) {
        matrixHandler.createSparseMatrix(data);
    }

    public RealMatrix getSparseMatrix() {
        return matrixHandler.getSparseMatrix();
    }

    public String getName() {
        return name;
    }
}
