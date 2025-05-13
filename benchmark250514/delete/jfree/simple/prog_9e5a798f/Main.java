import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        StandardCategoryToolTipGenerator generator = new StandardCategoryToolTipGenerator();
        
        /* write */ generator.setCategoryFormat(format);
        
        /* read */ NumberFormat readFormat = generator.getCategoryFormat();
        
        System.out.println(readFormat.equals(format)); // This should print true
    }
}