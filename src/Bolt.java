import java.io.Serializable;

public class Bolt extends OuterThreaded implements Serializable {
    public Bolt(double length, Threads threadSize, Materials.ThreadedMaterials material,
               Finishes.BoltFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
    }


}
