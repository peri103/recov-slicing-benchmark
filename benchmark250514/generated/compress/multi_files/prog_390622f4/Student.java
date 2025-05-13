public class Student {
    private String name;
    private GroupManager groupManager;

    public Student(String name, String fileName) {
        this.name = name;
        this.groupManager = new GroupManager(fileName);
    }

    public void assignToGroup(String groupName) {
        groupManager.setGroupName(groupName);
    }

    public String getGroupName() {
        return groupManager.getGroupName();
    }

    public String getName() {
        return name;
    }
}
