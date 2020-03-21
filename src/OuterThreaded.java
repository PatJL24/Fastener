import java.io.Serializable;

public class OuterThreaded extends Threaded implements Serializable {

    private static final long serialVersionUID = 1L;
    private double length;

    //OuterThreaded Constructor
    public OuterThreaded(double length, Threads threadSize, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
        setLength(length);
    }

    //Sets the length if the length is valid.
    public void setLength(double len) throws IllegalFastener {
        if (len >= 0.5 && len <= 6.0 && len % 0.25 == 0) this.length = len;
        else if (len >= 6 && len <= 11 && len % 0.5 == 0) this.length = len;
        else if (len >= 11 && len <= 20 && len % 1 == 0) this.length = len;
        else throw new IllegalFastener("Illegal length: " + len);
    }

    //Returns a String.
    public String toString(){
        return this.length + "\" long, " + super.toString();
    }
}
