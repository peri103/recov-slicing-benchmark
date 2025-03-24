public class Student {
    private String name;
    private DataStore dataStore = new DataStore();

    public Student(String name) {
        this.name = name;
    }

    public void storeScore(String key, int score) {
        dataStore.storeValue(key, score);
    }

    public int getScore(String key) {
        return dataStore.retrieveValue(key);
    }

    public String getName() {
        return name;
    }
}
