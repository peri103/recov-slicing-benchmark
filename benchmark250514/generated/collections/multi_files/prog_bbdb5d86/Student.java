public class Student {
    private String name;
    private int age;
    private MultiKeyValueStore scores;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.scores = new MultiKeyValueStore();
    }

    public void addScore(String subject, int score) {
        scores.addValue(name, subject, score);
    }

    public int getScore(String subject) {
        return scores.getValue(name, subject);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
