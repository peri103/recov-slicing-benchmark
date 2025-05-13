import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        StandardCategoryToolTipGenerator generator = new StandardCategoryToolTipGenerator();
        
        /* write */ generator.setCategoryFormat(format);
        
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Category 1");
        categories.add("Category 2");
        categories.add("Category 3");
        
        HashMap<String, Double> values = new HashMap<>();
        values.put("Category 1", 100.0);
        values.put("Category 2", 200.0);
        values.put("Category 3", 300.0);
        
        for (String category : categories) {
            double value = values.get(category);
            System.out.println("Value for " + category + ": " + value);
        }
        
        NumberFormat readFormat = generator.getCategoryFormat();
        
        /* read */ System.out.println(readFormat.equals(format)); // This should print true
        
        double sum = 0;
        for (Double value : values.values()) {
            sum += value;
        }
        System.out.println("Total sum of values: " + sum);
        
        ArrayList<Double> valueList = new ArrayList<>(values.values());
        double average = sum / valueList.size();
        System.out.println("Average value: " + average);
    }
}