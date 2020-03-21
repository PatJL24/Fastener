import java.io.Serializable;

public class Nail extends UnThreaded implements Serializable {

    private NailDesigns.CommonNailLengths nailLengths;
    private NailDesigns.CommonNailSizes nailSizes;
    private NailDesigns.CommonNailGauges nailGauges;

    public Nail(NailDesigns.CommonNailSizes nailSizes, NailDesigns.CommonNailLengths nailLengths, NailDesigns.CommonNailGauges nailGauges,
                Finishes.CommonNailFinish finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        super(Materials.NailMaterials.Steel, finish, unitPrice, numPerUnit);
        setNailSize(nailSizes);
        setNailLengths(nailLengths);
        setNailGauges(nailGauges);
        setNailFinish(finish);
    }

    private void setNailFinish(Finishes.CommonNailFinish finishNail) throws IllegalFastener{
        if(finishNail == null) throw new IllegalFastener("Illegal Nail Finish.");
        else this.finish = finishNail;
    }

    private void setNailGauges(NailDesigns.CommonNailGauges gaugesNail) throws IllegalFastener {
        if(gaugesNail == null) throw new IllegalFastener("Illegal Nail Gauge.");
        else this.nailGauges = gaugesNail;
    }

    private void setNailLengths(NailDesigns.CommonNailLengths lengthsNail) throws IllegalFastener {
        if(lengthsNail == null) throw new IllegalFastener("Illegal Nail Length.");
        else this.nailLengths = lengthsNail;
    }

    private void setNailSize(NailDesigns.CommonNailSizes sizeNails) throws IllegalFastener {
        if(sizeNails == null) throw new IllegalFastener("Illegal Nail Size.");
        else this.nailSizes = sizeNails;
    }

    public String toString(){
        return this.nailSizes + " size, " + this.nailLengths + "\" long, " + this.nailGauges + " gauge, " + super.toString();
    }

}
