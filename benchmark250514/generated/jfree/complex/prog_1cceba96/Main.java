import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.BasicStroke;
import org.jfree.chart.plot.XYPlot;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        XYPlot xyPlot = new XYPlot();
        ArrayList<Color> colorList = new ArrayList<>();

        // Set up some initial configurations
        xyPlot.setOutlinePaint(Color.BLUE);
        xyPlot.setOutlineStroke(new BasicStroke(2.0f));
        colorList.add(Color.GREEN);
        colorList.add(Color.YELLOW);
        
        // More operations with xyPlot
        Color xyOutlinePaint = (Color) xyPlot.getOutlinePaint();
        System.out.println("XY Plot Outline Paint: " + xyOutlinePaint.toString());

        // Working with the color list
        for (Color color : colorList) {
            System.out.println("Color in list: " + color.toString());
        }

        // Original write operation
        /* write */ piePlot.setOutlinePaint(Color.RED);

        // Additional operations
        xyPlot.setOutlinePaint(Color.MAGENTA);
        colorList.add(Color.ORANGE);
        Color someColor = colorList.get(0);
        System.out.println("First color in list: " + someColor.toString());

        // Final read operation
        /* read */ Color outlinePaint = (Color) piePlot.getOutlinePaint();
        System.out.println("Pie Plot Outline Paint: " + outlinePaint.toString());

        // More operations with colorList
        for (Color color : colorList) {
            System.out.println("Final color in list: " + color.toString());
        }
    }
}