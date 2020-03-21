import java.io.Serializable;

public class WoodScrew extends Screw implements Serializable {

    public Enum<?> screwPoint;

    public WoodScrew(double length, Threads threadSize, Enum<Materials.ThreadedMaterials> material, Enum<Finishes.ScrewFinish> finish,
                     ScrewDesigns.ScrewHeads screwHead, ScrewDesigns.ScrewDrive screwDrive,
                     ScrewDesigns.WoodScrewPoints screwPoint,
                     double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, screwHead, screwDrive, unitPrice, numPerUnit);
        setScrewPoint(screwPoint);
    }

    private void setScrewPoint(Enum<ScrewDesigns.WoodScrewPoints> pointScrew) throws IllegalFastener{
        if(pointScrew == null) throw new IllegalFastener("Illegal Point Type.");
        /**
        for(ScrewDesigns.WoodScrewPoints pointType: ScrewDesigns.WoodScrewPoints.values()){
            if(pointScrew != pointType) throw new IllegalFastener("Illegal Point Type: " + pointScrew);
        }*/
        this.screwPoint = pointScrew;
    }

    public String toString(){
        return "Wood Screw, " + screwPoint + " point, " + super.toString();
    }
}
