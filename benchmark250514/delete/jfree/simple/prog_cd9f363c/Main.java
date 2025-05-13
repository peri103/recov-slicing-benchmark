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
        /* read */ Dataset readDataset = plot.getDataset();
        
        System.out.println(readDataset != null ? "Dataset successfully read from plot." : "Failed to read dataset from plot.");
    }
}