package stock_management.equipment;

import behaviours.ISell;

public class Equipment implements ISell {

    private String description;
    private int cost;
    private int RRP;

    public Equipment(String description, int cost) {
        this.description = description;
        this.cost = cost;
        this.RRP = cost + markUp();
    }

    public int markUp(){
        int markUp = (int) Math.round(this.cost * 0.1);
        return markUp;
    }
}
