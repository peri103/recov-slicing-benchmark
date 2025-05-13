public class Course {
    private String courseName;
    private BidiMapWrapper<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = new BidiMapWrapper<>();
    }

    public void addStudentScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public Integer getStudentScore(String studentName) {
        return studentScores.get(studentName);
    }

    public void removeStudent(String studentName) {
        studentScores.remove(studentName);
    }

    public int getTotalStudents() {
        return studentScores.size();
    }
}
