import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        // Create a Font object to set as the label font
        Font font = new Font("Arial", Font.PLAIN, 12);
        
        /* write */ legendItem.setLabelFont(font);
        
        /* read */ Font retrievedFont = legendItem.getLabelFont();
        
        System.out.println("Font Name: " + retrievedFont.getFontName());
        System.out.println("Font Style: " + retrievedFont.getStyle());
        System.out.println("Font Size: " + retrievedFont.getSize());
    }
}