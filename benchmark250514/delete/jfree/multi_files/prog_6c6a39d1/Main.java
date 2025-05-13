import org.jfree.chart.axis.SubCategoryAxis;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        SubCategoryAxis axis = new SubCategoryAxis("Demo Axis");
        SubCategoryPaintManager manager = new SubCategoryPaintManager(axis);

        SubCategory subCategory1 = new SubCategory("SubCategory1");
        SubCategory subCategory2 = new SubCategory("SubCategory2");

        Paint paint1 = Color.RED;
        Paint paint2 = Color.BLUE;

        manager.setPaintForSubCategory(subCategory1.getName(), paint1);
        manager.setPaintForSubCategory(subCategory2.getName(), paint2);

        // Additional operations
        Paint paint3 = Color.GREEN;
        manager.setPaintForSubCategory("SubCategory3", paint3);

        // More complex operations
        for (String subCategory : manager.getAllSubCategoryPaints().keySet()) {
            Paint currentPaint = manager.getPaintForSubCategory(subCategory);
            System.out.println("Paint for " + subCategory + ": " + currentPaint);
        }

        // Original read method
        /* read */ Paint retrievedPaint = manager.getPaintForSubCategory(subCategory1.getName());

        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}