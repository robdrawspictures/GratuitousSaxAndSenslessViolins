package stock_management.equipment;

import behaviours.IBuy;
import behaviours.ISell;

public class Equipment implements ISell, IBuy {

    private String description;
    private int cost;
    private int RRP;

    public Equipment(String description, int cost) {
        this.description = description;
        this.cost = cost;
        this.RRP = cost + markUp();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

}
