import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        /* write */ plot.setSectionOutlinePaint("Section1", Color.RED);
        
        /* read */ Color outlinePaint = (Color) plot.getSectionOutlinePaint("Section1");
        
        System.out.println(outlinePaint);
    }
}