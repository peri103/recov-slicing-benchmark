public class Student {
    private String name;
    private StrokeManager strokeManager = new StrokeManager();

    public Student(String name) {
        this.name = name;
    }

    public void setStrokeForSeries(int series, Stroke stroke) {
        strokeManager.setSeriesStroke(series, stroke);
    }

    public Stroke getStrokeForSeries(int series) {
        return strokeManager.getSeriesStroke(series);
    }

    public String getName() {
        return name;
    }
}
