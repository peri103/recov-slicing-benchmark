public class Student {
    private String name;
    private VectorOperations scores;

    public Student(String name, double[] initialScores) {
        this.name = name;
        this.scores = new VectorOperations(initialScores);
    }

    public RealVector getScaledScores(double scalar) {
        return scores.scaleVector(scalar);
    }

    public RealVector addScores(RealVector additionalScores) {
        return scores.addVector(additionalScores);
    }

    public OpenMapRealVector getScores() {
        return scores.getVector();
    }
}
