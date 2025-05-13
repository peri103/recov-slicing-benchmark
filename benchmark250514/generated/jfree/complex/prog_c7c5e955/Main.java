import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        Paint paint = Color.RED;
        
        // Additional complexity: Using a PiePlot with different colors
        PiePlot piePlot = new PiePlot();
        piePlot.setSectionPaint(0, Color.BLUE);
        piePlot.setSectionPaint(1, Color.GREEN);
        
        // Store some colors in an ArrayList
        ArrayList<Paint> colorList = new ArrayList<>();
        colorList.add(Color.YELLOW);
        colorList.add(Color.MAGENTA);
        
        // Set the series paint in SpiderWebPlot
        /* write */ plot.setSeriesPaint(0, paint);
        
        // Retrieve and print the paint for PiePlot sections
        Paint piePaint1 = piePlot.getSectionPaint(0);
        Paint piePaint2 = piePlot.getSectionPaint(1);
        System.out.println("PiePlot Section 0 Paint: " + piePaint1);
        System.out.println("PiePlot Section 1 Paint: " + piePaint2);
        
        // Add more colors to the colorList
        colorList.add(Color.CYAN);
        colorList.add(Color.ORANGE);
        
        // Simulate some operations on the colorList
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Color from list: " + colorList.get(i));
        }
        
        // Retrieve the series paint from SpiderWebPlot
        /* read */ Paint retrievedPaint = plot.getSeriesPaint(0);
        
        // Print the retrieved paint
        System.out.println("SpiderWebPlot Series 0 Paint: " + retrievedPaint);
    }
}