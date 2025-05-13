public class Student {
    private String name;
    private MatrixOperations scoresMatrix;
    
    public Student(String name, int subjects) {
        this.name = name;
        this.scoresMatrix = new MatrixOperations(subjects, 1);
    }
    
    public void setScores(double[] scores) {
        scoresMatrix.setColumnVector(0, scores);
    }
    
    public RealVector getScores() {
        return scoresMatrix.getColumnVector(0);
    }
}
