import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<LegendItemWrapper> legendItems;

    public Course(String courseName) {
        this.courseName = courseName;
        this.legendItems = new ArrayList<>();
    }

    public void addLegendItem(LegendItemWrapper item) {
        legendItems.add(item);
    }

    public ArrayList<LegendItemWrapper> getLegendItems() {
        return legendItems;
    }

    public String getCourseName() {
        return courseName;
    }
}
