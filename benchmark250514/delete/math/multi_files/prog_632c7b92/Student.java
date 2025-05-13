public class Student {
    private String name;
    private RealVectorOperations vectorOperations;

    public Student(String name, double[][] data) {
        this.name = name;
        this.vectorOperations = new RealVectorOperations(data);
    }

    public void setScores(double[] scores) {
        vectorOperations.setRowVector(0, scores);
    }

    public RealMatrix getMatrix() {
        return vectorOperations.getMatrix();
    }
}
