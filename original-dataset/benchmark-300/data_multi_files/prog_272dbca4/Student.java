public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        dataStorage.addData(score);
    }

    public Vector<Integer> getScores() {
        return dataStorage.getData();
    }
}
