public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        dataProcessor.addData(score);
    }

    public int getScore() throws InterruptedException {
        return dataProcessor.getData();
    }
}
