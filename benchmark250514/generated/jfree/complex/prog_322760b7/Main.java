import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize XYPlot and set axis
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("X-Axis");
        NumberAxis rangeAxis = new NumberAxis("Y-Axis");
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);

        // Set a paint for gridlines
        Paint paint = Color.RED;
        /* write */ plot.setRangeGridlinePaint(paint);

        // Some unrelated operations
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Perform operations on the list
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        // Additional paint setting and retrieval
        Paint paint2 = Color.BLUE;
        plot.setDomainGridlinePaint(paint2);
        Paint retrievedPaint2 = plot.getDomainGridlinePaint();
        System.out.println("Domain Gridline Paint: " + retrievedPaint2);

        // Retrieve the paint used for range gridlines
        /* read */ Paint retrievedPaint = plot.getRangeGridlinePaint();
        System.out.println("Range Gridline Paint: " + retrievedPaint);

        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}