import com.google.common.collect.MutableClassToInstanceMap;

public class Course {
    private String courseName;
    private MutableClassToInstanceMap<Object> grades = MutableClassToInstanceMap.create();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String subject, int grade) {
        /* write */ grades.putInstance(subject.getClass(), subject + ":" + grade);
    }

    public int getGrade(String subject) {
        String gradeInfo = grades.getInstance(subject.getClass());
        /* read */ return Integer.parseInt(gradeInfo.split(":")[1]);
    }
}
