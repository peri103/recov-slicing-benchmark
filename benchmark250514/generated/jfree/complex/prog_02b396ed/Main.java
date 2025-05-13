import org.jfree.chart.plot.FastScatterPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FastScatterPlot plot = new FastScatterPlot();
        ArrayList<Paint> paintList = new ArrayList<>();

        // Initializing some Paint objects
        Paint paint1 = Color.BLUE;
        Paint paint2 = Color.GREEN;
        Paint paint3 = Color.YELLOW;

        // Adding Paint objects to the list
        paintList.add(paint1);
        paintList.add(paint2);
        paintList.add(paint3);

        // Set the domain gridline paint to RED
        /* write */ plot.setDomainGridlinePaint(Color.RED);

        // Some unrelated operations
        for (int i = 0; i < paintList.size(); i++) {
            System.out.println("Paint color at index " + i + ": " + paintList.get(i));
        }

        // More operations
        Paint currentPaint = paintList.get(1); // Get the GREEN paint
        System.out.println("Current selected paint: " + currentPaint);

        // Retrieve the domain gridline paint
        /* read */ Paint domainGridlinePaint = plot.getDomainGridlinePaint();

        // Display the domain gridline paint
        System.out.println("Domain Gridline Paint: " + domainGridlinePaint);

        // Further operations
        if (domainGridlinePaint.equals(Color.RED)) {
            System.out.println("The domain gridline paint is correctly set to RED.");
        } else {
            System.out.println("The domain gridline paint is not set correctly.");
        }
    }
}