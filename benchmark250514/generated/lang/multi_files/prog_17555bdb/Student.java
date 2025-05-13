public class Student {
    private String name;
    private MutableFloatWrapper performanceScore = new MutableFloatWrapper();

    public Student(String name) {
        this.name = name;
    }

    public void setPerformanceScore(float score) {
        performanceScore.setValue(score);
    }

    public float getPerformanceScore() {
        return performanceScore.getValue();
    }
}