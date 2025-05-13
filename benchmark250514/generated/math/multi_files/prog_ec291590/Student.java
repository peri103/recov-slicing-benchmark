public class Student {
    private String name;
    private SymmetricMatrix scoresMatrix;

    public Student(String name, int matrixSize) {
        this.name = name;
        this.scoresMatrix = new SymmetricMatrix(matrixSize);
    }

    public void setScore(int subjectIndex1, int subjectIndex2, double score) {
        scoresMatrix.setEntry(subjectIndex1, subjectIndex2, score);
    }

    public double getScore(int subjectIndex1, int subjectIndex2) {
        return scoresMatrix.getEntry(subjectIndex1, subjectIndex2);
    }

    public String getName() {
        return name;
    }
}
