public class Student {
    private String name;
    private int age;
    private DataStore dataStore = new DataStore();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void storeScore(int score) {
        dataStore.storeData("score", score);
    }

    public int getScore() {
        return dataStore.retrieveData("score");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
