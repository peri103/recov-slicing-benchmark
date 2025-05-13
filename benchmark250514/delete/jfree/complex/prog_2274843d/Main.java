import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StandardXYItemLabelGenerator labelGenerator = new StandardXYItemLabelGenerator();
        StandardPieSectionLabelGenerator pieLabelGenerator = new StandardPieSectionLabelGenerator();
        
        Map<String, String> formatMap = new HashMap<>();
        formatMap.put("XY", "{0}: {1}, {2}");
        formatMap.put("Pie", "{0} = {1}");
        
        /* write */ labelGenerator.setFormatString(formatMap.get("XY"));
        
        pieLabelGenerator.setSectionFormat("{0} - {1}");
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            if (i == 5) {
                System.out.println("Halfway there!");
            }
        }
        
        /* read */ String formatString = labelGenerator.getFormatString();
        System.out.println("XY Format: " + formatString);
        
        String pieFormatString = pieLabelGenerator.getSectionFormat();
        System.out.println("Pie Format: " + pieFormatString);
        
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}