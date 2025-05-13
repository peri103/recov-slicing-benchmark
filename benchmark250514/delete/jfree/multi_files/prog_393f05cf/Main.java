public class Main {
    public static void main(String[] args) {
        ThermometerManager manager = new ThermometerManager();
        manager.configureThermometer();
        
        ThermometerPlot plot = manager.getThermometerPlot();
        TemperatureDisplay display = new TemperatureDisplay(plot);
        
        // Additional unrelated operations
        double currentTemperature = 37.5;
        plot.setValue(currentTemperature);
        plot.setUnits(plot.UNITS_CELSIUS);
        
        display.displayTemperatureFormat();
        
        // Output the current temperature
        System.out.println("Current Temperature: " + plot.getValue());
    }
}