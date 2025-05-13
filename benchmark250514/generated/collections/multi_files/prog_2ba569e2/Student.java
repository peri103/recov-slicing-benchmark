import org.apache.commons.collections4.set.ListOrderedSet;

public class Student {
    private String name;
    private ListOrderedSet<String> subjects = new ListOrderedSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollSubject(String subject) {
        /* write */ subjects.add(subject);
    }

    public String getSubject(int index) {
        /* read */ return subjects.get(index);
    }

    public String getName() {
        return name;
    }
}
