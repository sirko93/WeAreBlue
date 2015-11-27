package eu.execom.hackaton.beacon.model;

import com.orm.SugarRecord;

/**
 * Created by eestec on 11/27/2015.
 */
public class Article extends SugarRecord<Article> {

    private String name;

    private String description;

    private double price;

    private int discount;

    public Article() {}

    public Article(String name, String description, double price, int discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
