import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Comparable key = "SectionKey"; // Initialize the key for the section
        
        /* write */ plot.setSectionOutlinePaint(key, Color.RED);
        /* read */ java.awt.Paint paint = plot.getSectionOutlinePaint(key);
        
        System.out.println(paint.toString());
    }
}