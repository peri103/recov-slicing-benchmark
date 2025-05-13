import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        LegendTitle legendTitle = new LegendTitle(null);
        ArrayList<String> seriesNames = new ArrayList<>();
        
        legendTitle.setBackgroundPaint(Color.WHITE);
        legendTitle.setPosition(LegendTitle.DEFAULT_POSITION);

        /* write */ legendItem.setSeriesKey("Key1");

        for (int i = 0; i < 5; i++) {
            seriesNames.add("Series " + i);
        }

        for (String name : seriesNames) {
            LegendItem tempItem = new LegendItem(name);
            tempItem.setSeriesKey(name + "_Key");
            legendTitle.addLegendItem(tempItem);
        }

        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println(seriesKey);

        for (int i = 0; i < seriesNames.size(); i++) {
            System.out.println("Legend Item: " + seriesNames.get(i));
        }

        System.out.println("Legend Title Position: " + legendTitle.getPosition());
    }
}