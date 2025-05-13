import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Font font = new Font("Arial", Font.PLAIN, 12);

        /* write */ legendItem.setLabelFont(font);
        /* read */ Font readFont = legendItem.getLabelFont();

        System.out.println("Font Name: " + readFont.getName());
        System.out.println("Font Style: " + readFont.getStyle());
        System.out.println("Font Size: " + readFont.getSize());
    }
}