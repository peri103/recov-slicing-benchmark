public class Student {
    private String name;
    private int age;
    private StudentScores scores = new StudentScores();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public int getScore(int index) {
        return scores.getScore(index);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
