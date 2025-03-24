public class Student {
    private String name;
    private int age;
    private DataStore dataStore = new DataStore();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void storeScore(String subject, int score) {
        dataStore.storeData(subject, score);
    }

    public int getScore(String subject) {
        return dataStore.retrieveData(subject);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
