import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;

public class ToolTipConfig {
    private StandardCategoryToolTipGenerator generator;

    public ToolTipConfig() {
        this.generator = new StandardCategoryToolTipGenerator();
    }

    public void configureCategoryFormat(NumberFormat format) {
        /* write */ generator.setCategoryFormat(format);
    }

    public NumberFormat retrieveCategoryFormat() {
        return generator.getCategoryFormat();
    }
}
