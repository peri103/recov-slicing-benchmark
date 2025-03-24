public class User {
    private String name;
    private DataStore dataStore = new DataStore();

    public User(String name) {
        this.name = name;
    }

    public void addData(String data) {
        dataStore.addData(data);
    }

    public boolean checkData(String data) {
        return dataStore.containsData(data);
    }
}
