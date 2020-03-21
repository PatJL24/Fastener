import java.io.Serializable;

public class InnerThreaded extends Threaded implements Serializable {

    //InnerThreaded Constructor
    public InnerThreaded(Threads threadSize, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
    }

    //Returns a String
    public String toString(){
        return super.toString();
    }
}
