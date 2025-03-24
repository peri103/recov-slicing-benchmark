public class User {
    private String name;
    private DataManager dataManager = new DataManager();

    public User(String name) {
        this.name = name;
    }

    public void addData(String data) {
        dataManager.addData(data);
    }

    public boolean checkData(String data) {
        return dataManager.containsData(data);
    }
}
