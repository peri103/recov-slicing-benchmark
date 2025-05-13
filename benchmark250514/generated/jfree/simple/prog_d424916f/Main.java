import org.jfree.chart.plot.PiePlot;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Font font = new Font("Serif", Font.PLAIN, 12);
        
        /* write */ plot.setLabelFont(font);
        /* read */ Font readFont = plot.getLabelFont();
        
        System.out.println(readFont);
    }
}