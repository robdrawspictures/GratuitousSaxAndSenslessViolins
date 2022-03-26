import behaviours.IBuy;
import behaviours.ISell;
import stock_management.instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    private int till;
    private ArrayList<ISell> stock;

    public Shop(int till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addToStock(ISell newStock){
        this.stock.add(newStock);
    }

    public void removeFromStock(ISell removedItem){
        this.stock.remove(removedItem);
    }

    public int getTotalProfit(){
        int totalMarkup = 0;
        for(ISell item : stock){
            totalMarkup += item.markUp();
        }
        return totalMarkup;
    }

    public void buy(IBuy item){
        this.till -= item.getCost();
        addToStock((ISell) item);
    }

    public void sell(ISell item){
        this.till += item.getRRP();
        this.stock.remove(item);
    }

    public ArrayList<ISell> getLeftHandedGuitars(){
        ArrayList<ISell> leftHanded = new ArrayList<>();
        for (ISell item : stock){
            if(item instanceof Guitar){
                if(((Guitar) item).isLeftHanded()) {
                    leftHanded.add(item);
                }
            }
        }
        return leftHanded;
    }
}
