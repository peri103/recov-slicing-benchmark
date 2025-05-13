public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        
        course.addStudentScore("Alice", 95);
        course.addStudentScore("Bob", 85);
        
        /* read */ Integer aliceScore = course.getStudentScore("Alice");
        
        System.out.println("Alice's score: " + aliceScore);
        
        System.out.println("Total students: " + course.getTotalStudents());
        
        course.removeStudent("Bob");
        
        System.out.println("Total students after removal: " + course.getTotalStudents());
    }
}