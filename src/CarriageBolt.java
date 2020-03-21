import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable {

    private static final long serialVersionUID = 1L;

    //CarriageBolt Constructor
    public CarriageBolt(double length, Threads threadSize, Materials.ThreadedMaterials material, Finishes.BoltFinish finish,
                        double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
    } //End CarriageBolt

    //Returns a part of a sentence.
    public String toString(){
        return "Carriage Bolt " + super.toString();
    } //End toString
}
