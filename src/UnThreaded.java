import java.io.Serializable;

public class UnThreaded extends Fastener implements Serializable {

    public UnThreaded(Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(material, finish, unitPrice, numPerUnit);
    }

}
