import com.google.common.collect.MutableClassToInstanceMap;

public class Course {
    private String courseName;
    private MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addMaterial(String material) {
        /* write */ map.putInstance(String.class, material);
    }

    public String getMaterial() {
        /* read */ return map.getInstance(String.class);
    }

    public String getCourseName() {
        return courseName;
    }
}
