import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class PaintManager {
    private SubCategoryAxis axis;
    private Map<String, Paint> categoryPaints;

    public PaintManager(String axisTitle) {
        this.axis = new SubCategoryAxis(axisTitle);
        this.categoryPaints = new HashMap<>();
    }

    public void setPaintForCategory(String category, Paint paint) {
        categoryPaints.put(category, paint);
        /* write */ axis.setSubCategoryPaint(category, paint);
    }

    public Paint getPaintForCategory(String category) {
        return axis.getSubCategoryPaint(category);
    }

    public void applyAllPaints() {
        for (Map.Entry<String, Paint> entry : categoryPaints.entrySet()) {
            axis.setSubCategoryPaint(entry.getKey(), entry.getValue());
        }
    }
}
