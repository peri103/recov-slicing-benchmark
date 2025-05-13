public class Student {
    private String name;
    private SymmetricMatrixWrapper scoreMatrix;

    public Student(String name, int matrixSize) {
        this.name = name;
        this.scoreMatrix = new SymmetricMatrixWrapper(matrixSize);
    }

    public void setScore(int subjectIndex1, int subjectIndex2, double score) {
        scoreMatrix.setMatrixEntry(subjectIndex1, subjectIndex2, score);
    }

    public double getScore(int subjectIndex1, int subjectIndex2) {
        return scoreMatrix.getMatrixEntry(subjectIndex1, subjectIndex2);
    }

    public String getName() {
        return name;
    }
}
