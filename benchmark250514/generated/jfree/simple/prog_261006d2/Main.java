import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a Font object to write
        Font font = new Font("Serif", Font.PLAIN, 12);

        /* write */ legendItem.setLabelFont(font);

        /* read */ Font readFont = legendItem.getLabelFont();

        // Output the font details to verify the read value
        System.out.println("Font Name: " + readFont.getName());
        System.out.println("Font Style: " + readFont.getStyle());
        System.out.println("Font Size: " + readFont.getSize());
    }
}