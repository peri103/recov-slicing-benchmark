import org.jfree.chart.LegendItem;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Comparable seriesKey = "Sample Series Key";
        
        /* write */ legendItem.setSeriesKey(seriesKey);
        
        ArrayList<LegendItem> legendList = new ArrayList<>();
        HashMap<String, LegendItem> legendMap = new HashMap<>();
        
        legendList.add(legendItem);
        legendMap.put("key1", legendItem);
        
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        legendList.add(anotherLegendItem);
        legendMap.put("key2", anotherLegendItem);
        
        for (LegendItem item : legendList) {
            System.out.println("Legend: " + item.getLabel());
        }
        
        LegendItem retrievedLegendItem = legendMap.get("key1");
        System.out.println("Retrieved Legend: " + retrievedLegendItem.getLabel());
        
        /* read */ Comparable readSeriesKey = legendItem.getSeriesKey();
        
        System.out.println("Series Key from LegendItem: " + readSeriesKey);
        
        for (String key : legendMap.keySet()) {
            LegendItem item = legendMap.get(key);
            System.out.println("Map Legend: " + item.getLabel());
        }
        
        LegendItem thirdLegendItem = new LegendItem("Third Legend");
        legendList.add(thirdLegendItem);
        legendMap.put("key3", thirdLegendItem);
        
        for (int i = 0; i < legendList.size(); i++) {
            LegendItem item = legendList.get(i);
            System.out.println("List Legend [" + i + "]: " + item.getLabel());
        }
    }
}