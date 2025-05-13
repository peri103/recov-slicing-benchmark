import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Student {
    private String name;
    private MatrixOperations scoresMatrix;

    public Student(String name, int numSubjects) {
        this.name = name;
        this.scoresMatrix = new MatrixOperations(numSubjects, numSubjects);
    }

    public void setScore(int subjectIndex, double score) {
        scoresMatrix.setMatrixEntry(subjectIndex, subjectIndex, score);
    }

    public double getScore(int subjectIndex) {
        return scoresMatrix.getMatrixEntry(subjectIndex, subjectIndex);
    }

    public RealMatrix getScoresMatrix() {
        return MatrixUtils.createRealMatrix(new double[][]{
            {getScore(0), 0, 0},
            {0, getScore(1), 0},
            {0, 0, getScore(2)}
        });
    }
}
