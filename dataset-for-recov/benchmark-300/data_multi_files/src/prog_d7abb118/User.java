public class User {
    private String name;
    private DataStorage storage = new DataStorage();

    public User(String name) {
        this.name = name;
    }

    public void storeData(String data) {
        storage.addData(data);
    }

    public boolean checkData(String data) {
        return storage.containsData(data);
    }
}
