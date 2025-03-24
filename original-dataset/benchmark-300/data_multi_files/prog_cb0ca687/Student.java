public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void storeScore(int score) {
        dataManager.storeData("score", score);
    }

    public int getScore() {
        return dataManager.retrieveData("score");
    }
}
