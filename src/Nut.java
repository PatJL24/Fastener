import java.io.Serializable;

public class Nut extends InnerThreaded implements Serializable {

    public Nut(Threads threadSize, Materials.ThreadedMaterials material,
               Finishes.WingNutFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
    }
}
