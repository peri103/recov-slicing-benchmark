import org.jfree.chart.util.SortOrder;

public class Main {
    public static void main(String[] args) {
        // Create a course and some students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 1, 3.8);
        Student student2 = new Student("Bob", 2, 3.6);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId() + ", GPA: " + student.getGpa());
        }

        // Handle chart data
        ChartDataHandler chartHandler = new ChartDataHandler();
        chartHandler.setDataExtractOrder(SortOrder.ASCENDING);

        // Perform some unrelated operations
        int totalStudents = course.getStudents().size();
        System.out.println("Total students in course: " + totalStudents);

        // Retrieve and print the data extract order
        /* read */ SortOrder order = chartHandler.getDataExtractOrder();
        System.out.println("Data extract order: " + order);
    }
}