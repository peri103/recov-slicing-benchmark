import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Comparable sectionKey = "Section 1";
        Paint paint = Color.RED;
        
        /* write */ piePlot.setSectionPaint(sectionKey, paint);
        /* read */ Paint retrievedPaint = piePlot.getSectionPaint(sectionKey);
        
        System.out.println(retrievedPaint);
    }
}