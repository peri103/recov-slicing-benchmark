public class Student {
    private String name;
    private ImmutableTableHandler tableHandler = new ImmutableTableHandler();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        tableHandler.putValue(name, subject, score);
    }

    public Integer getScore(String subject) {
        return tableHandler.getValue(name, subject);
    }
}
