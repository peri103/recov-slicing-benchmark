import org.jfree.chart.plot.PiePlot;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot instance
        PiePlot plot = new PiePlot();
        
        // Create a Font instance
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        // Use the write method to set the label font
        /* write */ plot.setLabelFont(font);
        
        // Use the read method to get the label font
        /* read */ Font readFont = plot.getLabelFont();
        
        // Print the font to verify it was set and read correctly
        System.out.println(readFont);
    }
}