public class Main {
    public static void main(String[] args) {
        // Create a chart renderer and configure it
        ChartRenderer chartRenderer = new ChartRenderer();
        chartRenderer.configureDotRenderer(10);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }

        // Read the configured dot height from the chart renderer
        /* read */ int dotHeight = chartRenderer.getDotHeight();
        System.out.println("Configured Dot Height: " + dotHeight);
    }
}