public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.enrollCourse("Computer Science");
        
        student.addGrade("Mathematics", 95);
        student.addGrade("Physics", 88);

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled Course: " + student.getEnrolledCourse());

        int mathGrade = student.getGrade("Mathematics");
        System.out.println("Mathematics Grade: " + mathGrade);

        int physicsGrade = student.getGrade("Physics");
        System.out.println("Physics Grade: " + physicsGrade);
    }
}