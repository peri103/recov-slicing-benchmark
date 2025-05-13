import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        
        // Define a key for the section
        Comparable key = "Section1";
        
        // Define a color for the section
        Paint paint = Color.RED;
        
        /* write */ piePlot.setSectionPaint(key, paint);
        
        /* read */ Paint retrievedPaint = piePlot.getSectionPaint(key);
        
        // Output the result
        System.out.println(retrievedPaint);
    }
}