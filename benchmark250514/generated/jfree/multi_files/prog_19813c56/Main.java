import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendManager legendManager = new LegendManager("Sample Legend");
        legendManager.setSeriesKey("SeriesKey1");

        Course course = new Course("Advanced Java Programming");
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        ArrayList<String> students = course.getEnrolledStudents();
        for (String student : students) {
            System.out.println("Enrolled student: " + student);
        }

        System.out.println("Course: " + course.getCourseName());

        // Retrieve the series key from LegendManager
        /* read */ Object seriesKey = legendManager.getSeriesKey();
        System.out.println("Final Series Key: " + seriesKey);
    }
}