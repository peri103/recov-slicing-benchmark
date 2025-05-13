public class Student {
    private String name;
    private int id;
    private Title title;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.title = new Title();
    }

    public void setTitleText(String text) {
        title.setText(text);
    }

    public String getTitleText() {
        return title.getText();
    }
}
