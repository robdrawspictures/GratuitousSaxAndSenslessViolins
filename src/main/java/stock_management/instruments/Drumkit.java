package stock_management.instruments;

import behaviours.IPlay;

public class Drumkit extends Instrument implements IPlay {

    private int pieces;
    private boolean electric;

    public Drumkit(String make, InstrumentType type, int cost, int pieces, boolean electric) {
        super(make, type, cost);
        this.pieces = pieces;
        this.electric = electric;
    }

    public String play(){
        return "Kick, snare. Kick, kick, snare.";
    }

}
