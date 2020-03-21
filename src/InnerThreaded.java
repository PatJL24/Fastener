import java.io.Serializable;

public class InnerThreaded extends Threaded implements Serializable {

    public InnerThreaded(Threads threadSize, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
    }


}
