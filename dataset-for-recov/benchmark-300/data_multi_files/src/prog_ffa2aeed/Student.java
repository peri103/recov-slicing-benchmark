public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeStudentData(int key, String value) {
        dataStorage.storeData(key, value);
    }

    public String getStudentData(int key) {
        return dataStorage.retrieveData(key);
    }
}
