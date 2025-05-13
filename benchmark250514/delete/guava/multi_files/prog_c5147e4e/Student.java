public class Student {
    private String name;
    private int age;
    private ImmutableListBuilder listBuilder = new ImmutableListBuilder();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addScore(int score) {
        listBuilder.addElement(score);
    }

    public ImmutableList<Integer> getScores() {
        return listBuilder.buildList();
    }
}
