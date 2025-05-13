import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a CategoryAxis object to be used in the write operation
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Create a ValueAxis object and set it to the plot
        ValueAxis valueAxis = new NumberAxis("Value Axis");
        plot.setRangeAxis(valueAxis);
        
        // Create an ArrayList and populate it with some data
        ArrayList<String> dataList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dataList.add("Data " + i);
        }
        
        // Perform some operations on the dataList
        for (String data : dataList) {
            System.out.println(data);
        }
        
        // Write operation: Set the domain axis for the plot
        /* write */ plot.setDomainAxis(domainAxis);
        
        // Add more complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        // Read operation: Retrieve the domain axis from the plot
        /* read */ CategoryAxis retrievedAxis = plot.getDomainAxis();
        
        // Print the label of the retrieved axis to verify the operation
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
        
        // Additional logic to manipulate the plot
        plot.setDomainGridlinesVisible(true);
        System.out.println("Domain Gridlines Visible: " + plot.isDomainGridlinesVisible());
    }
}