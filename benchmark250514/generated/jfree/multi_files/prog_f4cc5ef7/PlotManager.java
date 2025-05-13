import java.util.ArrayList;
import java.util.List;

public class PlotManager {
    private List<Double> plotSettings = new ArrayList<>();
    private PlotSettings plotSettingsInstance = new PlotSettings();

    public void addPlotSetting(double setting) {
        plotSettings.add(setting);
    }

    public void calculateAverageSetting() {
        double sum = 0;
        for (Double setting : plotSettings) {
            sum += setting;
        }
        double averageSetting = sum / plotSettings.size();
        System.out.println("Average Plot Setting: " + averageSetting);
    }

    public void setPlotHeadPercent(double percent) {
        plotSettingsInstance.setHeadPercent(percent);
    }

    public double getPlotHeadPercent() {
        return plotSettingsInstance.getHeadPercent();
    }

    public void printAdjustedSettings() {
        double headPercent = getPlotHeadPercent();
        for (Double setting : plotSettings) {
            double adjustedSetting = setting * headPercent;
            System.out.println("Adjusted Setting: " + adjustedSetting);
        }
    }
}