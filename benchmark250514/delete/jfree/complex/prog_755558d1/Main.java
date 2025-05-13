import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYDotRenderer dotRenderer = new XYDotRenderer();
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        
        /* write */ dotRenderer.setDotWidth(10);
        
        ArrayList<Integer> widths = new ArrayList<>();
        widths.add(5);
        widths.add(15);
        widths.add(20);
        
        for (Integer width : widths) {
            lineRenderer.setSeriesShapesVisible(width % 2 == 0);
        }
        
        int sumOfWidths = 0;
        for (Integer width : widths) {
            sumOfWidths += width;
        }
        
        int averageWidth = sumOfWidths / widths.size();
        
        if (averageWidth > dotRenderer.getDotWidth()) {
            System.out.println("Average width is greater than dot width.");
        } else {
            System.out.println("Dot width is greater or equal to average width.");
        }
        
        /* read */ int dotWidth = dotRenderer.getDotWidth();
        System.out.println("Dot width: " + dotWidth);
        
        ArrayList<Boolean> visibilityList = new ArrayList<>();
        for (int i = 0; i < widths.size(); i++) {
            visibilityList.add(lineRenderer.getSeriesShapesVisible(i));
        }
        
        for (Boolean visibility : visibilityList) {
            System.out.println("Series visibility: " + visibility);
        }
    }
}