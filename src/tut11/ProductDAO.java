package tut11;

import tut11.product.Product;

import java.io.Serializable;

public class ProductDAO extends DAO<Product> {

    @Override
    public void update(Product product) {
        for (Product p : dataList) {
            if (p.getName().equals(product.getName())) {
                p.setPrice(product.getPrice());
                // You can add more fields to update here if needed
                return; // Exiting the loop once the product is updated
            }
        }
    }

    @Override
    public Product find(Serializable id) {
        String name = (String) id;
        for (Product p : dataList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }


}
