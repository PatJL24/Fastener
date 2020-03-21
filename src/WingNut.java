import java.io.Serializable;

public class WingNut extends Nut implements Serializable {

    private static final long serialVersionUID = 1L;

    //WingNut Constructor
    public WingNut(Threads threadSize, Materials.ThreadedMaterials material,
                   Finishes.WingNutFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
    } //End WingNut

    //Returns a part of a sentence.
    public String toString() {
        return "Wing Nut " + super.toString();
    } //End toString
}
