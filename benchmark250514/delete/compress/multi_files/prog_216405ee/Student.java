public class Student {
    private String name;
    private int age;
    private GroupEntry groupEntry;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.groupEntry = new GroupEntry();
    }

    public void assignGroupId(long groupId) {
        groupEntry.setGroupId(groupId);
    }

    public long retrieveGroupId() {
        return groupEntry.getGroupId();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
