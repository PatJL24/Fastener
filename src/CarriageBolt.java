import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable {

    //CarriageBolt Constructor
    public CarriageBolt(double length, Threads threadSize, Materials.ThreadedMaterials material, Finishes.BoltFinish finish,
                        double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
    } //End CarriageBolt

    //Returns a String
    public String toString(){
        return "Carriage Bolt " + super.toString();
    } //End toString
}
