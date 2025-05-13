import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        // Create a ChartDomain object
        ChartDomain chartDomain = new ChartDomain();
        
        // Create a CategoryAxis and set it to the ChartDomain
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        chartDomain.setDomainAxis(domainAxis);
        
        // Create a DataSeries object and add some data
        DataSeries dataSeries = new DataSeries();
        dataSeries.addSeries("Series1", new double[]{10, 20, 30, 40, 50});
        
        // Retrieve the domain axis from the ChartDomain
        /* read */ CategoryAxis retrievedAxis = chartDomain.getDomainAxis();
        
        // Print out the label of the retrieved axis to verify it is the same as the one set
        System.out.println(retrievedAxis.getLabel());
        
        // Retrieve and print the data from the DataSeries
        System.out.println("Data from Series1:");
        dataSeries.getDataset().getSeries(0).forEach(item -> 
            System.out.println("X: " + item.getX() + ", Y: " + item.getY())
        );
    }
}