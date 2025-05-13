import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Paint;
import java.util.HashMap;

public class PaintManager {
    private SubCategoryAxis axis;
    private HashMap<String, Paint> subCategoryPaints;

    public PaintManager(String axisName) {
        this.axis = new SubCategoryAxis(axisName);
        this.subCategoryPaints = new HashMap<>();
    }

    public void setPaintForSubCategory(String subCategory, Paint paint) {
        /* write */ axis.setSubCategoryPaint(subCategory, paint);
        subCategoryPaints.put(subCategory, paint);
    }

    public Paint getPaintForSubCategory(String subCategory) {
        return axis.getSubCategoryPaint(subCategory);
    }

    public HashMap<String, Paint> getAllSubCategoryPaints() {
        return subCategoryPaints;
    }
}
