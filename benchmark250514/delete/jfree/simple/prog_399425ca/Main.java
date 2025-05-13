import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        StandardCategoryToolTipGenerator generator = new StandardCategoryToolTipGenerator();
        DecimalFormat format = new DecimalFormat("#.##");
        
        /* write */ generator.setCategoryFormat(format);
        /* read */ DecimalFormat retrievedFormat = generator.getCategoryFormat();
        
        System.out.println(retrievedFormat.toPattern());
    }
}