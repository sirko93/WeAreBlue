package eu.execom.hackaton.beacon.model;

import com.orm.SugarRecord;

/**
<<<<<<< HEAD
 * Created by Giannis on 28/11/2015.
 */
public class Article extends SugarRecord<Article> {
    private String name;
    private String description;

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
=======
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
>>>>>>> origin/master
    }

    public double getPrice() {
        return price;
    }

<<<<<<< HEAD
    public void setPrice(double price) {
        this.price = price;
    }

=======
>>>>>>> origin/master
    public int getDiscount() {
        return discount;
    }

<<<<<<< HEAD
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    private double price;
    private int discount;
    public Article(String name, String description, double price, int discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }





=======
    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
>>>>>>> origin/master
}
