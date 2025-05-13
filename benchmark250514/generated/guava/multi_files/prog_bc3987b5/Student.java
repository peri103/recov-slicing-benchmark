public class Student {
    private String name;
    private int age;
    private StudentScores scores = new StudentScores();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addScore(String course, int score) {
        scores.addScore(course, score);
    }

    public int getScore(String course) {
        return scores.getScore(course);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
