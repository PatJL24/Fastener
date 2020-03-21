import java.io.Serializable;

public class Nut extends InnerThreaded implements Serializable {

    private static final long serialVersionUID = 1L;

    //Nut Constructor
    public Nut(Threads threadSize, Materials.ThreadedMaterials material,
               Finishes.WingNutFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(threadSize, material, finish, unitPrice, numPerUnit);
    } //End Nut

    //Returns a part of a sentence.
    public String toString(){
        return super.toString();
    } //End toString
}
