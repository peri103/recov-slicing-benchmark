public class Student {
    private String name;
    private DataManager dataManager = new DataManager();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(String subject, int grade) {
        dataManager.storeData(subject, grade);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
