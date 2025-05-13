import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Axis axis = new CategoryAxis();
        Axis numberAxis = new NumberAxis("Number Axis");
        ArrayList<Axis> axisList = new ArrayList<>();

        // Adding axes to the list
        axisList.add(axis);
        axisList.add(numberAxis);

        // Set labels for all axes
        for (Axis ax : axisList) {
            ax.setLabel(ax.getLabel() + " - Updated");
        }

        // Perform some operations on the number axis
        numberAxis.setLabel("Updated Number Axis Label");

        // Print all axis labels
        for (Axis ax : axisList) {
            System.out.println(ax.getLabel());
        }

        /* write */ axis.setLabel("Sample Label");

        // Some more operations with number axis
        String numberAxisLabel = numberAxis.getLabel();
        System.out.println("Number Axis Label: " + numberAxisLabel);

        // Modify the axisList
        axisList.remove(numberAxis);
        axisList.add(new CategoryAxis("New Category Axis"));

        // Iterate and print again
        for (Axis ax : axisList) {
            System.out.println(ax.getLabel());
        }

        /* read */ String label = axis.getLabel();
        System.out.println(label);

        // Additional operations
        Axis anotherAxis = new CategoryAxis("Another Axis");
        axisList.add(anotherAxis);

        for (Axis ax : axisList) {
            ax.setLabel(ax.getLabel() + " - Final");
        }

        for (Axis ax : axisList) {
            System.out.println(ax.getLabel());
        }
    }
}