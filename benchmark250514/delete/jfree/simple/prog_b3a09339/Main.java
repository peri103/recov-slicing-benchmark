import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            private Dataset dataset;

            @Override
            public String getPlotType() {
                return "Custom Plot";
            }

            @Override
            public void setDataset(Dataset dataset) {
                this.dataset = dataset;
            }

            @Override
            public Dataset getDataset() {
                return this.dataset;
            }
        };

        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 43.2);
        dataset.setValue("Category 2", 27.9);
        dataset.setValue("Category 3", 29.0);

        /* write */ plot.setDataset(dataset);
        /* read */ Dataset retrievedDataset = plot.getDataset();

        System.out.println(retrievedDataset);
    }
}