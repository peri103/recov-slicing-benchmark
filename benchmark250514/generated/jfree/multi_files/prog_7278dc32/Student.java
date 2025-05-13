public class Student {
    private String name;
    private ChartSettings chartSettings;

    public Student(String name) {
        this.name = name;
        this.chartSettings = new ChartSettings();
    }

    public String getName() {
        return name;
    }

    public ChartSettings getChartSettings() {
        return chartSettings;
    }
}
