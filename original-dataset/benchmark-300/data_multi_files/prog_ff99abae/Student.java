public class Student {
    private String name;
    private DataStorage storage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeScore(int score) {
        storage.storeData(score);
    }

    public Vector<Integer> getScores() {
        return storage.getData();
    }
}
