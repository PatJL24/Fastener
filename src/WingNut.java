import java.io.Serializable;

public class WingNut extends Nut implements Serializable {

    public WingNut(Threads threadSize, Materials.ThreadedMaterials material,
                   Finishes.WingNutFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
    }

    public String toString() {
        return "Wing Nut " + super.toString();
    }
}
