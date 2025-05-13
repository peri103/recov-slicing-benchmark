public class Student {
    private String name;
    private BagHandler bagHandler;

    public Student(String name) {
        this.name = name;
        this.bagHandler = new BagHandler();
    }

    public void addItemToBag(String item) {
        bagHandler.addItem(item);
    }

    public int getItemCountFromBag(String item) {
        return bagHandler.getItemCount(item);
    }

    public String getName() {
        return name;
    }
}
