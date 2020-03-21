import java.io.Serializable;

public class UnThreaded extends Fastener implements Serializable {

    private static final long serialVersionUID = 1L;

    //UnThreaded Constructor
    public UnThreaded(Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(material, finish, unitPrice, numPerUnit);
    } //End UnThreaded
}
