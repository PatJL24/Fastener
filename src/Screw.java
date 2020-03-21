import java.io.Serializable;

public class Screw extends OuterThreaded implements Serializable {

    public Enum<?> screwHead;
    public Enum<?> screwDrive;

    public Screw(double length, Threads threadSize, Enum<Materials.ThreadedMaterials> material, Enum<Finishes.ScrewFinish> finish,
                 ScrewDesigns.ScrewHeads screwHead, ScrewDesigns.ScrewDrive screwDrive,
                 double unitPrice, int numPerUnit) throws IllegalFastener {
        super(length, threadSize, material, finish, unitPrice, numPerUnit);
        setScrewHead(screwHead);
        setScrewDrive(screwDrive);
        setFinish(finish);
    }

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
    }

    private void setScrewHead(Enum<ScrewDesigns.ScrewHeads> headScrew) throws IllegalFastener{
        if(headScrew == null) throw new IllegalFastener("Illegal Head Type.");
        /**
        for(ScrewDesigns.ScrewHeads headType: ScrewDesigns.ScrewHeads.values()){
            if (headScrew != headType) throw new IllegalFastener("Illegal Screw Head Type: " + headScrew);
        } */
        this.screwHead = headScrew;
    }

    private void setScrewDrive(Enum<ScrewDesigns.ScrewDrive> driveScrew) throws IllegalFastener{
        if(driveScrew == null) throw new IllegalFastener("Illegal Drive Type.");
        /**
        for(ScrewDesigns.ScrewDrive driveType: ScrewDesigns.ScrewDrive.values()){
            if (driveScrew != driveType) throw new IllegalFastener("Illegal Screw Drive Type: " + driveScrew);
        }*/
        this.screwDrive = driveScrew;
    }

    public String toString(){
        return screwHead + " head, " + screwDrive + " drive, " + super.toString();
    }
}
