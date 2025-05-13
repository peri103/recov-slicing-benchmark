public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 1);
        Student student2 = new Student("Jane Smith", 2);

        Course mathCourse = new Course("Mathematics");
        
        mathCourse.addStudentGrade(student1.getId(), 101, "A");
        mathCourse.addStudentGrade(student2.getId(), 101, "B");
        
        // Simulating other operations
        System.out.println("Course: " + mathCourse.getCourseName());
        System.out.println("Student: " + student1.getName() + ", ID: " + student1.getId());
        System.out.println("Student: " + student2.getName() + ", ID: " + student2.getId());
        
        // Retrieve and print the grade for a specific student and exam
        /* read */ String grade = mathCourse.getStudentGrade(1, 101);
        
        System.out.println("Grade for " + student1.getName() + " in exam 101: " + grade);
    }
}