public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student = new Student("Alice", mathCourse);
        
        mathCourse.addGrade(student.getName(), 95);
        
        int grade = student.getCourse().getGrade(student.getName());
        System.out.println("Grade for " + student.getName() + " in " + student.getCourse().getCourseName() + ": " + grade);

        // Additional data structure usage
        Course scienceCourse = new Course("Science");
        scienceCourse.addGrade("Bob", 88);
        System.out.println("Grade for Bob in " + scienceCourse.getCourseName() + ": " + scienceCourse.getGrade("Bob"));
    }
}