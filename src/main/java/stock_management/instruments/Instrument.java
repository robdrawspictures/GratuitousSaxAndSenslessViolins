package stock_management.instruments;

import behaviours.IBuy;
import behaviours.ISell;

abstract public class Instrument implements IBuy, ISell {

    private String make;
    private InstrumentType type;
    private int cost;
    private int RRP;

    public Instrument(String make, InstrumentType type, int cost) {
        this.make = make;
        this.type = type;
        this.cost = cost;
        this.RRP = cost + markUp();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRRP() {
        return RRP;
    }

    public void setRRP(int RRP) {
        this.RRP = RRP;
    }

    public int markUp(){
        int markUp = (int) Math.round(this.cost * 0.1);
        return markUp;
    }

    abstract public String play();
}
