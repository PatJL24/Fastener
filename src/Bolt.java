import java.io.Serializable;

public class Bolt extends OuterThreaded implements Serializable {

    private static final long serialVersionUID = 1L;

    //Bolt Constructor
    public Bolt(double length, Threads threadSize, Materials.ThreadedMaterials material,
               Finishes.BoltFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
    } //end Bolt

    //Returns a part of a sentence.
    public String toString(){
        return super.toString();
    } //End toString
}
