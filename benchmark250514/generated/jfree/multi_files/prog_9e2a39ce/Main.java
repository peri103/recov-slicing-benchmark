import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Working with DateAxisHandler
        DateAxisHandler dateAxisHandler = new DateAxisHandler();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateAxisHandler.setDateFormat(dateFormat);
        
        // Working with students and courses
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.addGrade(85);
        student1.addGrade(90);
        
        student2.addGrade(78);
        student2.addGrade(82);
        
        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);
        
        System.out.println("Course: " + mathCourse.getCourseName());
        for (Student student : mathCourse.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }
        
        // Reading the date format set earlier
        /* read */ SimpleDateFormat readFormat = dateAxisHandler.getDateFormat();
        System.out.println("Read format: " + readFormat.toPattern());
    }
}