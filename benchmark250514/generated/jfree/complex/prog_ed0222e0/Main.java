import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Axis axis = new NumberAxis();
        CategoryAxis categoryAxis = new CategoryAxis();
        ArrayList<String> labels = new ArrayList<>();
        
        labels.add("Category 1");
        labels.add("Category 2");
        labels.add("Category 3");
        
        for (String label : labels) {
            categoryAxis.setLabel(label);
        }
        
        /* write */ axis.setLabel("Axis Label");

        int labelIndex = 0;
        for (String label : labels) {
            categoryAxis.setLabel(label);
            System.out.println("Category Axis Label: " + categoryAxis.getLabel());
            labelIndex++;
        }

        ArrayList<Axis> axes = new ArrayList<>();
        axes.add(axis);
        axes.add(categoryAxis);
        
        for (Axis ax : axes) {
            System.out.println("Axis: " + ax.getLabel());
        }
        
        /* read */ String label = axis.getLabel();
        System.out.println("Final Axis Label: " + label);

        NumberAxis anotherAxis = new NumberAxis();
        anotherAxis.setLabel("Another Axis");
        System.out.println("Another Axis Label: " + anotherAxis.getLabel());
    }
}