public class Main {
    public static void main(String[] args) {
        University university = new University();
        Course course = new Course("Computer Science");
        Student student = new Student("Alice");
        
        student.addScore("Math", 95);
        student.addScore("Science", 88);

        course.addStudent(student);
        university.addCourse(course);

        for (Course c : university.getCourses()) {
            for (Student s : c.getStudents()) {
                StudentScores scores = s.getScores();
                Integer mathScore = scores.getScore("Math");
                Integer scienceScore = scores.getScore("Science");
                System.out.println("Math Score: " + mathScore);
                System.out.println("Science Score: " + scienceScore);
            }
        }
    }
}