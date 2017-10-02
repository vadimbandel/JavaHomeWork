package javase01.t06;

/**
 * Class is notepad
 */
public class Notepad {
    /**
     * Array of notepad notes @see <Notepad>
     */
    private NoteInNotepad[] notes;
    /**
     * Variable for storing next free note
     */
    private int nextNote;

    public Notepad(int numbOfNotes) {
        notes = new NoteInNotepad[numbOfNotes];
    }

    /**
     * Method, which show every note with it number
     */

    public void showAllNotes() {
        for (int i = 0; i < nextNote; i++) {
            System.out.println(i + ": " + notes[i].getStr());
        }
    }

    /**
     * Method which checks availability of element at incoming index
     * @param nmbOfNote index of note in array
     * @return true/false
     */
    private boolean checkAvailability(int nmbOfNote) {
        if (nmbOfNote < 0 && nmbOfNote >= nextNote) {
            System.out.println("There is no note with such number!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Method edits notes
     * @param nmbOfNote index of note in array
     * @param str new note
     */
    public void editNote(int nmbOfNote, String str) {
        if (checkAvailability(nmbOfNote)) {
            notes[nmbOfNote].setStr(str);
        }
    }

    /**
     * Method deletes note in notepad
     *
     * @param nmbOfNote index of note in array
     */
    public void deleteNote(int nmbOfNote) {
        if (checkAvailability(nmbOfNote)) {
            for (int i = nmbOfNote; i < nextNote - 1 ; i++) {
                notes[i] = notes[i+1];
            }
            --nextNote;
        }
    }

    /**
     * Method checks is full notepad, if no, add new note in notepad
     * @param str strinf of new note
     */
    public void addNote(String str)
    {
        if (nextNote == notes.length) {
            System.out.println("The notepad is full!");
        } else {
            notes[nextNote] = new NoteInNotepad(str);
            ++nextNote;
        }
    }

}
