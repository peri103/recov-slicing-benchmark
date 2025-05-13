import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object
        PiePlot piePlot = new PiePlot();

        // Use the write method to set the label gap
        /* write */ piePlot.setLabelGap(0.05);

        // Use the read method to get the label gap
        /* read */ double labelGap = piePlot.getLabelGap();

        // Print the label gap value to verify it was set correctly
        System.out.println(labelGap);
    }
}