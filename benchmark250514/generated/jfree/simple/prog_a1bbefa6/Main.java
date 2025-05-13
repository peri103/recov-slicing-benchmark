import org.jfree.chart.plot.PiePlot;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Font font = new Font("Arial", Font.PLAIN, 12);
        /* write */ plot.setLabelFont(font);
        /* read */ Font retrievedFont = plot.getLabelFont();
        System.out.println("Font Name: " + retrievedFont.getFontName());
        System.out.println("Font Style: " + retrievedFont.getStyle());
        System.out.println("Font Size: " + retrievedFont.getSize());
    }
}