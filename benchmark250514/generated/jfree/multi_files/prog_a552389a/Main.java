import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a Course
        Course course = new Course("Data Structures");

        // Create LegendItemWrapper instances
        LegendItemWrapper item1 = new LegendItemWrapper("Chapter 1: Arrays");
        item1.setLinePaint(Color.RED);
        LegendItemWrapper item2 = new LegendItemWrapper("Chapter 2: Linked Lists");
        item2.setLinePaint(Color.BLUE);

        // Add items to the course
        course.addLegendItem(item1);
        course.addLegendItem(item2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (LegendItemWrapper item : course.getLegendItems()) {
            System.out.println("Legend: " + item.getLabel());
            System.out.println("Line Paint: " + item.getLinePaint());
        }

        // Retrieve and print the line paint color of the first legend item
        /* read */ Color linePaint = item1.getLinePaint();
        System.out.println("Line Paint Color of first item: " + linePaint);
    }
}