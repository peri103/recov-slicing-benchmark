import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PiePlot
        PiePlot plot = new PiePlot();

        // Set the outline paint using the write method
        /* write */ plot.setOutlinePaint(Color.RED);

        // Read the outline paint using the read method
        /* read */ Paint outlinePaint = plot.getOutlinePaint();

        // Print the result to verify the read value
        System.out.println(outlinePaint);
    }
}