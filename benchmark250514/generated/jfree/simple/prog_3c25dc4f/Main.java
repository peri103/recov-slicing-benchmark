import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();

        // Define a key for the section
        Comparable sectionKey = "Section1";

        // Define a color for the section
        Paint sectionPaint = Color.RED;

        /* write */ piePlot.setSectionPaint(sectionKey, sectionPaint);
        /* read */ Paint retrievedPaint = piePlot.getSectionPaint(sectionKey);

        // Output the result to verify the write and read operations
        System.out.println(retrievedPaint);
    }
}