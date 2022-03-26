package stock_management.instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int keyCount;
    private PianoType pianoType;

    public Piano(String make, InstrumentType type, int cost, int keyCount, PianoType pianoType) {
        super(make, type, cost);
        this.keyCount = keyCount;
        this.pianoType = pianoType;
    }

    public String play(){
        return "[FIRST TWO BARS OF 'FUR ELISE' INTENSIFIES]";
    }

}
