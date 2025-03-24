public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void addData(String data) {
        dataManager.addData(data);
    }

    public boolean checkData(String data) {
        return dataManager.containsData(data);
    }

    public CopyOnWriteArraySet<String> getData() {
        return dataManager.getDataSet();
    }
}
