import java.io.Serializable;

public class Threaded extends Fastener implements Serializable {

    private static final long serialVersionUID = -2039886965185700481L;

    private Threads threadSize;

    //Threaded Constructor
    public Threaded(Threads threadSize, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(material, finish, unitPrice, numPerUnit);
        setThreads(threadSize);
    } //End Threaded

    //Sets the Thread if the type of Thread is valid
    private void setThreads(Threads threads) throws IllegalFastener{
        if (threads == null) throw new IllegalFastener("Illegal Thread Size.");
        else this.threadSize = threads;
    } //End setThreads

    //Returns a String
    public String toString() {
        return this.threadSize + " thread, " + super.toString();
    } //End toString

}
