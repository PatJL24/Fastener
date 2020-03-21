import java.io.Serializable;

public class Screw extends OuterThreaded implements Serializable {

    private static final long serialVersionUID = 1L;

    public Enum<?> screwHead;
    public Enum<?> screwDrive;

    //Screw Constructor
    public Screw(double length, Threads threadSize, Enum<Materials.ThreadedMaterials> material, Enum<Finishes.ScrewFinish> finish,
                 ScrewDesigns.ScrewHeads screwHead, ScrewDesigns.ScrewDrive screwDrive,
                 double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
        setScrewHead(screwHead);
        setScrewDrive(screwDrive);
        setFinish(finish);
    } //End Screw

    //Sets the type of finish on a screw only if the combination is valid.
    private void setFinish(Enum<Finishes.ScrewFinish> screwFinish) throws IllegalFastener {
        String finishString = screwFinish.toString();
        String materialString = material.toString();

        if ((materialString == "Brass" || materialString == "Stainless_Steel") && finishString == "Black_Phosphate")
            throw new IllegalFastener("Illegal Combination. Cannot combine Brass and Black_Phosphate.");
        else if ((materialString == "Brass" || materialString == "Stainless_Steel") && finishString == "ACQ_1000_Hour")
            throw new IllegalFastener("Illegal Combination. Cannot combine Brass and ACQ_1000_Hour.");
        else if ((materialString == "Brass" || materialString == "Stainless_Steel") && finishString == "Lubricated")
            throw  new IllegalFastener("Illegal Combination. Cannot Combine Brass and Lubricated.");
        else
            this.finish = screwFinish;
    } //End setFinish.

    //Sets the Screw Head only if the type of head is valid.
    private void setScrewHead(Enum<ScrewDesigns.ScrewHeads> headScrew) throws IllegalFastener{
        if(headScrew == null) throw new IllegalFastener("Illegal Head Type.");
        else this.screwHead = headScrew;
    } //End setScrewHead

    //Sets the Screw Drive only if the type of drive is valid.
    private void setScrewDrive(Enum<ScrewDesigns.ScrewDrive> driveScrew) throws IllegalFastener{
        if(driveScrew == null) throw new IllegalFastener("Illegal Drive Type.");
        else this.screwDrive = driveScrew;
    }

    //Returns a part of a sentence.
    public String toString(){
        return screwHead + " head, " + screwDrive + " drive, " + super.toString();
    } //End toString
}
