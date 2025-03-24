public class Student {
    private String name;
    private int age;
    private DataStore dataStore = new DataStore();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void storeScore(String key, int score) {
        dataStore.storeData(key, score);
    }

    public Integer getScore(String key) {
        return dataStore.retrieveData(key);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
