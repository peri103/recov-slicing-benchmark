public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course mathCourse = new Course("Mathematics");

        student.enrollInCourse(mathCourse);

        mathCourse.addScore(student.getName(), 85);
        mathCourse.addScore(student.getName(), 90);

        for (Course course : student.getCourses()) {
            System.out.println("Course: " + course.getCourseName());
            /* read */ SortedSet<Integer> scores = course.getScores(student.getName());
            System.out.println("Scores for " + student.getName() + ": " + scores);
        }
    }
}