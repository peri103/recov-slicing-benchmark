public class Main {
    public static void main(String[] args) {
        ChartManager manager = new ChartManager();
        
        ChartSettings mainChart = new ChartSettings();
        mainChart.setMaximumLabelWidth(0.15);
        
        ChartSettings secondaryChart = new ChartSettings();
        secondaryChart.setMaximumLabelWidth(0.10);
        
        manager.addChart("MainChart", mainChart);
        manager.addChart("SecondaryChart", secondaryChart);

        manager.printAllLabelWidths();
        
        // Retrieve and print the maximum label width for the main chart
        /* read */ double mainChartWidth = manager.getChart("MainChart").getPlot().getMaximumLabelWidth();
        System.out.println("Maximum label width for the main chart: " + mainChartWidth);
    }
}