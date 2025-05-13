public class Main {
    public static void main(String[] args) {
        // CSV Handler to write and read comments
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.writeComment("This is a comment");

        // Creating a course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Adding grades to students
        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        // Adding students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Read and print the comment from CSV
        String comment = csvHandler.readComment();
        System.out.println("CSV Comment: " + comment);

        // Close CSV Handler
        csvHandler.close();
    }
}