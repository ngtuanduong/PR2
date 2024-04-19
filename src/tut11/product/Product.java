package tut11.product;

/**
  ----------------------------------------------------------------
 |  Attribute |   Type  | Mutable | Optional | Length | min | max |
 |----------------------------------------------------------------
 |    name    |  String |  False  |  False   |  50    |     |     |
 |   price    | Integer |  True   |  True    |        |  0  |     |
  ----------------------------------------------------------------
 */

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method to represent Product as a String
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

