import java.util.Vector;

public class Student {
    private String name;
    private DataStore dataStore = new DataStore();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        dataStore.addData(score);
    }

    public Vector<Integer> getScores() {
        return dataStore.getData();
    }
}
