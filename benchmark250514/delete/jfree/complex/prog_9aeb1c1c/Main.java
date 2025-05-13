import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Axis axis = new NumberAxis();
        Axis categoryAxis = new CategoryAxis("Category");
        ValueAxis valueAxis = new NumberAxis("Values");
        ArrayList<Axis> axisList = new ArrayList<>();

        /* write */ axis.setLabel("X-Axis Label");
        axisList.add(axis);
        axisList.add(categoryAxis);
        axisList.add(valueAxis);

        for (Axis ax : axisList) {
            System.out.println("Axis label: " + ax.getLabel());
        }

        String labelToUpdate = "Updated Value Axis Label";
        valueAxis.setLabel(labelToUpdate);

        Axis retrievedAxis = axisList.get(0);
        String label = retrievedAxis.getLabel();

        int sumOfLengths = 0;
        for (Axis ax : axisList) {
            sumOfLengths += ax.getLabel().length();
        }

        System.out.println("Sum of label lengths: " + sumOfLengths);

        /* read */ String label = axis.getLabel();
        System.out.println(label);

        for (int i = 0; i < axisList.size(); i++) {
            Axis currentAxis = axisList.get(i);
            System.out.println("Axis " + i + " label: " + currentAxis.getLabel());
        }
    }
}