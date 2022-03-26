package stock_management.instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay {

    private int stringCount;
    private boolean leftHanded;
    private GuitarType guitarType;

    public Guitar(String make, InstrumentType type, int cost, int stringCount, boolean leftHanded, GuitarType guitarType) {
        super(make, type, cost);
        this.stringCount = stringCount;
        this.leftHanded = leftHanded;
        this.guitarType = guitarType;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public boolean isLeftHanded() {
        return leftHanded;
    }

    public void setLeftHanded(boolean leftHanded) {
        this.leftHanded = leftHanded;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public String play(){
        return "Anyway, here's 'Wonderwall'.";
    }

}
