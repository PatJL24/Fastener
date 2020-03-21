import java.io.Serializable;

public class WoodScrew extends Screw implements Serializable {

    private static final long serialVersionUID = 1L;

    public Enum<?> screwPoint;

    //WoodScrew Constructor
    public WoodScrew(double length, Threads threadSize, Enum<Materials.ThreadedMaterials> material, Enum<Finishes.ScrewFinish> finish,
                     ScrewDesigns.ScrewHeads screwHead, ScrewDesigns.ScrewDrive screwDrive,
                     ScrewDesigns.WoodScrewPoints screwPoint,
                     double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, screwHead, screwDrive, unitPrice, numPerUnit);
        setScrewPoint(screwPoint);
    } //End WoodScrew

    //Sets the Screw Point only if the type of point is valid.
    private void setScrewPoint(Enum<ScrewDesigns.WoodScrewPoints> pointScrew) throws IllegalFastener{
        if(pointScrew == null) throw new IllegalFastener("Illegal Point Type.");
        else this.screwPoint = pointScrew;
    } //End setScrewPoint

    //Returns a part of a sentence.
    public String toString(){
        return "Wood Screw, " + screwPoint + " point, " + super.toString();
    } //End toString
}
