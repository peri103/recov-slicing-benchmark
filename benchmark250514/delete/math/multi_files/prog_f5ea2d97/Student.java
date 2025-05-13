public class Student {
    private String name;
    private double[][] scores;

    public Student(String name, double[][] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public double[][] getScores() {
        return scores;
    }
}
