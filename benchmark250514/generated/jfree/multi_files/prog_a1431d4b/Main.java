public class Main {
    public static void main(String[] args) {
        // Create a new ChartTitle object
        ChartTitle chartTitle = new ChartTitle();

        // Set the title text
        chartTitle.setTitleText("Data Structures");

        // Create a new Course object
        Course course = new Course("Advanced Java");

        // Add students to the course
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        // Print the course name and enrolled students
        System.out.println("Course: " + course.getCourseName());
        for (String student : course.getStudents()) {
            System.out.println("Student: " + student);
        }

        // Retrieve and print the title text
        /* read */ String titleText = chartTitle.getTitleText();
        System.out.println("Chart Title: " + titleText);
    }
}