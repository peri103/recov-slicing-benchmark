public class Main {
    public static void main(String[] args) {
        PlotManager plotManager = new PlotManager();

        plotManager.addPlotSetting(0.75);
        plotManager.setPlotHeadPercent(0.75);
        
        for (int i = 0; i < 5; i++) {
            plotManager.addPlotSetting(i * 0.1);
        }

        plotManager.calculateAverageSetting();

        /* read */ double headPercent = plotManager.getPlotHeadPercent();
        System.out.println("Head Percent: " + headPercent);

        plotManager.printAdjustedSettings();
    }
}