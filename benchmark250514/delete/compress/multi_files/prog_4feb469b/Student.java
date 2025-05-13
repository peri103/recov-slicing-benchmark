public class Student {
    private String name;
    private long groupId;

    public Student(String name, long groupId) {
        this.name = name;
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public long getGroupId() {
        return groupId;
    }
}
