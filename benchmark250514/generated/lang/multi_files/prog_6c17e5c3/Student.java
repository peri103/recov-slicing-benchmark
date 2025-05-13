public class Student {
    private String name;
    private StrBuilderWrapper notes = new StrBuilderWrapper();

    public Student(String name) {
        this.name = name;
        notes.initialize();
    }

    public void addNotes(String note) {
        notes.appendText(note);
    }

    public void adjustNotesLength(int length) {
        notes.setCustomLength(length);
    }

    public String getNotes() {
        return notes.getText();
    }

    public String getName() {
        return name;
    }
}