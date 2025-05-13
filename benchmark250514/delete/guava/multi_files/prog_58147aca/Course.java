public class Course {
    private String courseName;
    private ImmutableTableWrapper tableWrapper = new ImmutableTableWrapper();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(String student, String exam, Integer score) {
        tableWrapper.addEntry(student, exam, score);
    }

    public Integer getScore(String student, String exam) {
        ImmutableTable<String, String, Integer> table = tableWrapper.buildTable();
        return table.get(student, exam);
    }
}
