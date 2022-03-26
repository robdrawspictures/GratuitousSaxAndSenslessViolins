package stock_management.equipment;

public class Strings extends Equipment {

    private String type;
    private String make;

    public Strings(String description, int cost, String type, String make) {
        super(description, cost);
        this.type = type; // Steel, Nylon etc
        this.make = make;
    }
}
