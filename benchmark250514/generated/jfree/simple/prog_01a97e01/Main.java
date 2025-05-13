import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Comparable key = "Section1";
        Color color = Color.RED;
        
        /* write */ piePlot.setSectionOutlinePaint(key, color);
        /* read */ Color retrievedColor = (Color) piePlot.getSectionOutlinePaint(key);
        
        System.out.println(retrievedColor);
    }
}