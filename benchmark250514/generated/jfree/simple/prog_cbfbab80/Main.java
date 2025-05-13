import org.jfree.chart.LegendItem;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        Font font = new Font("Serif", Font.PLAIN, 12);
        
        /* write */ legendItem.setLabelFont(font);
        /* read */ Font retrievedFont = legendItem.getLabelFont();
        
        System.out.println(retrievedFont);
    }
}