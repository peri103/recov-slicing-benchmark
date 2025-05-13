import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PiePlot
        PiePlot plot = new PiePlot();

        // Define a Paint object to set as the outline paint
        Paint outlinePaint = Color.BLUE;

        // Use the setOutlinePaint method to write the outline paint
        /* write */ plot.setOutlinePaint(outlinePaint);

        // Create another PiePlot instance and set different properties
        PiePlot anotherPlot = new PiePlot();
        anotherPlot.setOutlinePaint(Color.RED);
        anotherPlot.setSectionOutlinesVisible(true);

        // Create a list to store plots
        ArrayList<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        plotList.add(anotherPlot);

        // Perform some operations on the list
        for (Plot p : plotList) {
            if (p instanceof PiePlot) {
                PiePlot pie = (PiePlot) p;
                System.out.println("Section outlines visible: " + pie.getSectionOutlinesVisible());
            }
        }

        // Use the getOutlinePaint method to read the outline paint
        /* read */ Paint readOutlinePaint = plot.getOutlinePaint();

        // Print the result to verify
        System.out.println("Outline paint of the first plot: " + readOutlinePaint);

        // Additional logic to manipulate colors
        ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);
        colorList.add(Color.MAGENTA);

        // Print colors
        for (Color color : colorList) {
            System.out.println("Color in list: " + color);
        }

        // Perform some operations with colors
        if (!colorList.isEmpty()) {
            Color firstColor = colorList.get(0);
            System.out.println("First color in list: " + firstColor);
        }

        // Use a loop to manipulate plot properties
        for (Plot p : plotList) {
            if (p instanceof PiePlot) {
                PiePlot pie = (PiePlot) p;
                pie.setSectionOutlinesVisible(false);
                System.out.println("Updated section outlines visible: " + pie.getSectionOutlinesVisible());
            }
        }
    }
}