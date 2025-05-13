import org.jfree.chart.labels.StandardXYItemLabelGenerator;

public class Main {
    public static void main(String[] args) {
        StandardXYItemLabelGenerator labelGenerator = new StandardXYItemLabelGenerator();
        /* write */ labelGenerator.setFormatString("{0}: {1}");
        /* read */ String formatString = labelGenerator.getFormatString();
        System.out.println(formatString);
    }
}