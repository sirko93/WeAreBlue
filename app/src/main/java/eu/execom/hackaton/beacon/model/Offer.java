package eu.execom.hackaton.beacon.model;

import com.orm.SugarRecord;

/**
 * Created by Giannis on 28/11/2015.
 */
public class Offer extends SugarRecord<Offer> {
    private String name;
    private String description;
    private double price;

    public Offer(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
