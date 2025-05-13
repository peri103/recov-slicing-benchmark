import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        // Set the label outline paint to a specific color
        /* write */ plot.setLabelOutlinePaint(Color.RED);
        
        // Retrieve the label outline paint
        /* read */ Paint labelOutlinePaint = plot.getLabelOutlinePaint();
        
        // Output the paint color to verify
        System.out.println(labelOutlinePaint);
    }
}