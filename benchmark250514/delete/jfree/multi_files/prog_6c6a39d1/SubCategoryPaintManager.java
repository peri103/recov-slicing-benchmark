import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Paint;
import java.util.HashMap;
import java.util.Map;

public class SubCategoryPaintManager {
    private SubCategoryAxis axis;
    private Map<String, Paint> subCategoryPaints = new HashMap<>();

    public SubCategoryPaintManager(SubCategoryAxis axis) {
        this.axis = axis;
    }

    public void setPaintForSubCategory(String subCategory, Paint paint) {
        subCategoryPaints.put(subCategory, paint);
        /* write */ axis.setSubCategoryPaint(subCategory, paint);
    }

    public Paint getPaintForSubCategory(String subCategory) {
        return axis.getSubCategoryPaint(subCategory);
    }

    public Map<String, Paint> getAllSubCategoryPaints() {
        return subCategoryPaints;
    }
}
