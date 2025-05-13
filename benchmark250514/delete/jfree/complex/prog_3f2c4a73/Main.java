import org.jfree.chart.plot.ThermometerPlot;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ThermometerPlot plot = new ThermometerPlot();
        DecimalFormat format = new DecimalFormat("#.##");
        
        List<Double> temperatureReadings = new ArrayList<>();
        temperatureReadings.add(36.5);
        temperatureReadings.add(37.0);
        temperatureReadings.add(38.2);
        
        double sum = 0;
        for (double temp : temperatureReadings) {
            sum += temp;
        }
        
        double averageTemp = sum / temperatureReadings.size();
        System.out.println("Average Temperature: " + averageTemp);

        /* write */ plot.setValueFormat(format);
        
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);

        for (double temp : temperatureReadings) {
            System.out.println("Formatted Temperature: " + numberFormat.format(temp));
        }

        /* read */ DecimalFormat readFormat = (DecimalFormat) plot.getValueFormat();
        
        System.out.println("Value format pattern: " + readFormat.toPattern());
        
        List<String> formattedTemperatures = new ArrayList<>();
        for (double temp : temperatureReadings) {
            formattedTemperatures.add(readFormat.format(temp));
        }
        
        System.out.println("Formatted Temperatures List: " + formattedTemperatures);
    }
}