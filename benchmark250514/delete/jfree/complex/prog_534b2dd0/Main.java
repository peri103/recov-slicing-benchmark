import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getInstance();
        
        /* write */ labelGenerator.setNumberFormat(format);
        
        // Additional unrelated code
        ArrayList<Double> values = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            values.add(Math.random() * 100);
        }
        
        StandardCategoryItemLabelGenerator categoryLabelGenerator = new StandardCategoryItemLabelGenerator();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        categoryLabelGenerator.setNumberFormat(decimalFormat);
        
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        double average = sum / values.size();
        System.out.println("Average: " + decimalFormat.format(average));
        
        // More complex operations
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        for (Double value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("Max Value: " + decimalFormat.format(maxValue));
        System.out.println("Min Value: " + decimalFormat.format(minValue));
        
        // Original read operation
        /* read */ NumberFormat readFormat = labelGenerator.getNumberFormat();
        System.out.println("Formatted number: " + readFormat.format(12345.6789));
    }
}