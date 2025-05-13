public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.enrollInCourse("Mathematics");
        
        // Additional logic
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        
        // Read from the course
        Course course = student.getCourse();
        /* read */ Integer score = course.getScores("Mathematics").iterator().next();
        System.out.println("Score in Mathematics: " + score);
        
        // Additional operations with unrelated data structures
        Student anotherStudent = new Student("Jane Doe", 22);
        anotherStudent.enrollInCourse("Physics");
        System.out.println("Another Student Name: " + anotherStudent.getName());
        System.out.println("Another Student Age: " + anotherStudent.getAge());
    }
}