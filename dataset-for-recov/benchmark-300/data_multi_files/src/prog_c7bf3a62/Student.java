public class Student {
    private String name;
    private DataProcessor dataProcessor = new DataProcessor();

    public Student(String name) {
        this.name = name;
    }

    public void writeScore(int score) {
        dataProcessor.writeData(score);
    }

    public int readScore() {
        return dataProcessor.readData();
    }
}
