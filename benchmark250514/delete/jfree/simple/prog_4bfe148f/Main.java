import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        
        Dataset dataset = new DefaultPieDataset();
        /* write */ plot.setDataset(dataset);
        /* read */ Dataset retrievedDataset = plot.getDataset();
        
        System.out.println(retrievedDataset != null ? "Dataset set and retrieved successfully." : "Failed to retrieve dataset.");
    }
}