public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeScore(int score) {
        dataStorage.storeData("score", score);
    }

    public int getScore() {
        return dataStorage.retrieveData("score");
    }
}
