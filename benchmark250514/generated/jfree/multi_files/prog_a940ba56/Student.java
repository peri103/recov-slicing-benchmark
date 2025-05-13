public class Student {
    private String name;
    private PiePlotWrapper plotWrapper;

    public Student(String name) {
        this.name = name;
        this.plotWrapper = new PiePlotWrapper();
    }

    public void setPlotMaxLabelWidth(double width) {
        plotWrapper.setMaxLabelWidth(width);
    }

    public double getPlotMaxLabelWidth() {
        return plotWrapper.getMaxLabelWidth();
    }

    public String getName() {
        return name;
    }
}
