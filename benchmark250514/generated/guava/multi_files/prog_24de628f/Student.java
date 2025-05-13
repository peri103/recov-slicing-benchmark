public class Student {
    private String name;
    private MultisetManager multisetManager = new MultisetManager();

    public Student(String name) {
        this.name = name;
    }

    public void addItemToMultiset(String item) {
        multisetManager.addItem(item);
    }

    public int getItemCountFromMultiset(String item) {
        return multisetManager.getItemCount(item);
    }

    public String getName() {
        return name;
    }
}
