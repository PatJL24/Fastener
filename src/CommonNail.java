import java.io.Serializable;

public class CommonNail extends Nail implements Serializable {

    private static final long serialVersionUID = 1L;

    //CommonNail Constructor
    public CommonNail(NailDesigns.CommonNailSizes nailSizes,
                      NailDesigns.CommonNailLengths nailLengths,
                      NailDesigns.CommonNailGauges nailGauges,
                      Finishes.CommonNailFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(nailSizes, nailLengths, nailGauges, finish, unitPrice, numPerUnit);
    }

    //Returns a part of a sentence.
    public String toString(){
        return "Common Nail, " + super.toString();
    } //End toString
}
