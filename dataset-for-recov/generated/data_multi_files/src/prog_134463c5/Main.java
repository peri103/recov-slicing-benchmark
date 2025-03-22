public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.enrollCourse("Mathematics");
        student.addGrade(85);
        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Enrolled Course: " + student.getCourse().getCourseName());
        
        // Add more grades
        student.addGrade(90);
        student.addGrade(95);
        
        // Get the latest grade
        int latestGrade = student.getCourse().getLatestGrade();
        System.out.println("Latest Grade: " + latestGrade);
    }
}