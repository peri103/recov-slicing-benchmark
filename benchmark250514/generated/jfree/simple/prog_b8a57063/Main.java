import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        Font font = new Font("Serif", Font.PLAIN, 12);

        /* write */ legendItem.setLabelFont(font);
        /* read */ Font readFont = legendItem.getLabelFont();

        System.out.println("Font: " + readFont.getFontName() + ", Size: " + readFont.getSize());
    }
}