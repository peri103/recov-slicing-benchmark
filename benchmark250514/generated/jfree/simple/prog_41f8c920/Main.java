import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PiePlot
        PiePlot plot = new PiePlot();

        // Define a Paint object to set as the outline paint
        Paint outlinePaint = Color.BLUE;

        // Use the setOutlinePaint method to write the outline paint
        /* write */ plot.setOutlinePaint(outlinePaint);

        // Use the getOutlinePaint method to read the outline paint
        /* read */ Paint readOutlinePaint = plot.getOutlinePaint();

        // Print the result to verify
        System.out.println(readOutlinePaint);
    }
}