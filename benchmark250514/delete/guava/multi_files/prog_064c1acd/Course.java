import com.google.common.collect.ImmutableSortedSet;

public class Course {
    private String courseName;
    private ImmutableSortedSet.Builder<Student> studentBuilder = ImmutableSortedSet.naturalOrder();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        /* write */ studentBuilder.add(student);
    }

    public ImmutableSortedSet<Student> getStudents() {
        return studentBuilder.build();
    }

    public boolean isStudentEnrolled(Student student) {
        ImmutableSortedSet<Student> students = getStudents();
        /* read */ return students.contains(student);
    }

    public String getCourseName() {
        return courseName;
    }
}
