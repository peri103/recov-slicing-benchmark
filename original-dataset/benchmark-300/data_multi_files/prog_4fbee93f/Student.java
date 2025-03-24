public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addData(String value) {
        dataManager.addData(value);
    }

    public boolean checkData(String value) {
        return dataManager.containsData(value);
    }

    public String getName() {
        return name;
    }
}
