import java.awt.Font;
import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Font font = new Font("Arial", Font.PLAIN, 12);
        /* write */ legendItem.setLabelFont(font);
        /* read */ Font readFont = legendItem.getLabelFont();
        System.out.println("Font: " + readFont.getFontName() + ", Style: " + readFont.getStyle() + ", Size: " + readFont.getSize());
    }
}