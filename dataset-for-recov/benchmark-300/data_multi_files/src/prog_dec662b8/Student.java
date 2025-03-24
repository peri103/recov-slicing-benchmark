public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeScore(String key, int score) {
        dataStorage.storeData(key, score);
    }

    public Integer getScore(String key) {
        return dataStorage.retrieveData(key);
    }
}
