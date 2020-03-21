import java.io.Serializable;

public class IllegalFastener extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    //Returns a sentence only when an error has occurred.
    public IllegalFastener(String message) {
        super(message);
    } //End IllegalFastener
}
