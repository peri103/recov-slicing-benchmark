import org.jfree.chart.plot.PiePlot;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Font font = new Font("Serif", Font.PLAIN, 12);
        /* write */ piePlot.setLabelFont(font);
        /* read */ Font retrievedFont = piePlot.getLabelFont();
        System.out.println(retrievedFont);
    }
}