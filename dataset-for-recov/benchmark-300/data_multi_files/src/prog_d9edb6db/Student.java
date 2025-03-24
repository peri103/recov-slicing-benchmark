public class Student {
    private String name;
    private DataStorage storage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        storage.addValue(score);
    }

    public boolean hasScore(int score) {
        return storage.containsValue(score);
    }
}
