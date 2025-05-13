import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore("Math", 95);
        student.addScore("Science", 88);

        Course mathCourse = new Course("Mathematics");
        mathCourse.addStudentScore(student.getName(), 95);

        Course scienceCourse = new Course("Science");
        scienceCourse.addStudentScore(student.getName(), 88);

        HashSetValuedHashMap<String, Integer> studentScores = student.getScores();
        
        for (String subject : studentScores.keySet()) {
            System.out.println("Subject: " + subject + ", Scores: " + studentScores.get(subject));
        }

        /* read */ Integer mathScore = studentScores.get("Math").iterator().next();
        System.out.println("Math Score: " + mathScore);

        MultiValuedMap<String, Integer> mathCourseScores = mathCourse.getStudentScores();
        for (String studentName : mathCourseScores.keySet()) {
            System.out.println("Course: " + mathCourse.getCourseName() + ", Student: " + studentName + ", Scores: " + mathCourseScores.get(studentName));
        }
    }
}