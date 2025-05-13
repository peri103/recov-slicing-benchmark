public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course math = new Course("Mathematics", "Dr. Smith");
        Course science = new Course("Science", "Dr. Brown");

        student.addGrade(math.getCourseName(), 85);
        student.addGrade(science.getCourseName(), 90);

        System.out.println("Student: " + student.getName());
        System.out.println(math.getCourseName() + " Instructor: " + math.getInstructor());
        System.out.println(science.getCourseName() + " Instructor: " + science.getInstructor());

        /* read */ int mathGrade = student.getGrade(math.getCourseName());
        System.out.println("Grade in " + math.getCourseName() + ": " + mathGrade);

        int scienceGrade = student.getGrade(science.getCourseName());
        System.out.println("Grade in " + science.getCourseName() + ": " + scienceGrade);
    }
}