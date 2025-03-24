public class Student {
    private String name;
    private DataStorage storage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        storage.addData(score);
    }

    public Vector<Integer> getScores() {
        return storage.getData();
    }
}
