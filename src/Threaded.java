import java.io.Serializable;

public class Threaded extends Fastener implements Serializable {

    private static final long serialVersionUID = -2039886965185700481L;

    private Threads threadSize;

    public Threaded(Threads threadSize, Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(material, finish, unitPrice, numPerUnit);
        setThreads(threadSize);
    }

    private void setThreads(Threads threads) throws IllegalFastener{
        if (threads == null) throw new IllegalFastener("Illegal Thread Size.");
        else this.threadSize = threads;
    }

    public String toString() {
        return this.threadSize + " thread, " + super.toString();
    }

}
