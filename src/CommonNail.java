import java.io.Serializable;

public class CommonNail extends Nail implements Serializable {

    public CommonNail(NailDesigns.CommonNailSizes nailSizes,
                      NailDesigns.CommonNailLengths nailLengths,
                      NailDesigns.CommonNailGauges nailGauges,
                      Finishes.CommonNailFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(nailSizes, nailLengths, nailGauges, finish, unitPrice, numPerUnit);
    }

    public String toString(){
        return "Common Nail, " + super.toString();
    }
}
