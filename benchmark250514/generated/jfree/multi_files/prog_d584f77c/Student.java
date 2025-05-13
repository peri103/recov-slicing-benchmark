public class Student {
    private String name;
    private double[] scores;

    public Student(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public int countAboveThreshold(double threshold) {
        int count = 0;
        for (double score : scores) {
            if (score > threshold) {
                count++;
            }
        }
        return count;
    }
}
