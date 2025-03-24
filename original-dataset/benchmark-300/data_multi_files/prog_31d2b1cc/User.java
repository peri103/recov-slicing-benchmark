public class User {
    private String name;
    private DataStorage storage = new DataStorage();

    public User(String name) {
        this.name = name;
    }

    public void storeData(String data) {
        storage.addData(data);
    }

    public HashSet<String> getStoredData() {
        return storage.getDataSet();
    }
}
