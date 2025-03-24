public class Student {
    private String name;
    private DataStore dataStore = new DataStore();

    public Student(String name) {
        this.name = name;
    }

    public void storeData(int key, String value) {
        dataStore.storeData(key, value);
    }

    public String retrieveData(int key) {
        return dataStore.retrieveData(key);
    }
}
