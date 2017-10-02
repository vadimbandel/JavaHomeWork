package javase01.t06;

public class Main {
    public static void main(String[] args) {
        Notepad ntp = new Notepad(3);
        ntp.addNote("Null note");
        ntp.addNote("First note");
        ntp.addNote("Second note");
        ntp.addNote("Third note");
        ntp.deleteNote(0);
        ntp.addNote("Second note");
        ntp.editNote(0, "Null note");
        ntp.editNote(1, "First note");
        ntp.showAllNotes();

    }
}
