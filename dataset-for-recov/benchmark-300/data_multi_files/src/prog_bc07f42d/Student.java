public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        dataManager.addData(score);
    }

    public boolean hasScore(int score) {
        return dataManager.containsData(score);
    }
}
