import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        
        // Additional code for complexity
        HashMap<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Apple", 30);
        dataMap.put("Banana", 20);
        dataMap.put("Cherry", 50);

        int totalValue = 0;
        for (Integer value : dataMap.values()) {
            totalValue += value;
        }
        
        System.out.println("Total value: " + totalValue);
        
        PieSectionLabelGenerator anotherLabelGenerator = new StandardPieSectionLabelGenerator("{0}: {1} ({2})");
        piePlot.setLabelGenerator(anotherLabelGenerator);
        
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit + ", Value: " + dataMap.get(fruit));
        }
        
        /* read */ StandardPieSectionLabelGenerator retrievedLabelGenerator = (StandardPieSectionLabelGenerator) piePlot.getLabelGenerator();
        
        System.out.println("Retrieved Label Generator: " + retrievedLabelGenerator);
    }
}