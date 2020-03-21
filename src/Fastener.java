import java.io.Serializable;

public class Fastener implements Serializable{

    private static final long serialVersionUID = 1L;

    public Enum<?> material;
    public Enum<?> finish;
    public double unitPrice;
    private int numPerUnit;

    // Fastener constructor
    public Fastener(Enum<?> material, Enum<?> finish, double unitPrice, int numPerUnit) throws IllegalFastener {
        if (material.toString() == "Steel" && finish.toString() == "Plain")
            throw new IllegalFastener("Illegal Material/Finish Combination.");
        if (material.toString() == "Brass" && finish.toString() != "Plain")
            throw new IllegalFastener("Illegal Material/Finish Combination.");
        if (material.toString() == "Stainless_Steel" && finish.toString() != "Plain"){
            throw new IllegalFastener("Illegal Material/Finish Combination.");
        }
        setMaterial(material);
        setFinish(finish);
        setUnitPrice(unitPrice);
        setNumPerUnit(numPerUnit);
    } //End Fastener

    // Sets the Number per unit if the number per unit is between 1 and 10000.
    private void setNumPerUnit(int numPUnit) throws IllegalFastener {
        if (numPUnit < 1 || numPUnit > 10000) throw new IllegalFastener("Illegal Amount of Units: " + numPerUnit);
        else this.numPerUnit = numPUnit;
    } //End setNumPerUnit

    //Sets the Unit Price if the price is above $0.
    private void setUnitPrice(double price) throws IllegalFastener{
        if (price > 0) this.unitPrice = price;
        else throw new IllegalFastener("Illegal Unit Price: " + unitPrice);
    } //End setUnitPrice

    //Sets the finish if the type of finish is valid.
    private void setFinish(Enum<?> finish) throws IllegalFastener {
        String finishString = finish.toString();
        if (finishString == null) throw new IllegalFastener("Illegal Finish: " + null);
        else this.finish = finish;
    } //End setFinish

    //Sets the Material if the type of material is valid.
    private void setMaterial(Enum<?> material) throws IllegalFastener {
        String materialString = material.name();
        if(materialString.equals("Brass") || materialString.equals("Stainless_Steel") || materialString.equals("Steel")){
            this.material = material;
        } else throw new IllegalFastener("Illegal Material: " + materialString);
    } //End setMaterial

    // Gets the total order cost.
    public double getOrderCost(double order){
        return this.unitPrice * order;
    } //End getOrderCost

    // Returns a String.
    public String toString() {
        return this.material + ", " + "with a " + this.finish + " finish. " + this.numPerUnit
                + " in a unit, " + "$" + this.unitPrice + " per unit.";
    } //End toString
}
