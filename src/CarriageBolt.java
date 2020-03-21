import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable {

    public CarriageBolt(double length, Threads threadSize, Materials.ThreadedMaterials material, Finishes.BoltFinish finish,
                        double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
    }

    public String toString(){
        return "Carriage Bolt " + super.toString();
    }
}
