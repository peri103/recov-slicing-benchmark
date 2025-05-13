public class Student {
    private String name;
    private MatrixOperations matrixOps = new MatrixOperations();

    public Student(String name) {
        this.name = name;
    }

    public void setMatrixData(double[] columnData) {
        matrixOps.createColumnMatrix(columnData);
    }

    public RealMatrix getMatrix() {
        return matrixOps.getColumnMatrix();
    }
}
