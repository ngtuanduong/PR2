package tut11.product;

import tut11.ProductDAO;

public class ProductDAOTest {
    public static void main(String[] args) {
        // Creating ProductDAO instance
        ProductDAO productDAO = new ProductDAO();

        // Adding some products
        productDAO.add(new Product("Laptop", 1000));
        productDAO.add(new Product("Phone", 500));
        productDAO.add(new Product("Tablet", 300));

        // Printing the list before update
        System.out.println("List of products before update:");
        for (Product product : productDAO.getList()) {
            System.out.println(product);
        }

        // Updating a product
        Product updatedProduct = new Product("Phone", 600);
        productDAO.update(updatedProduct);

        // Printing the list after update
        System.out.println("\nList of products after update:");
        for (Product product : productDAO.getList()) {
            System.out.println(product);
        }

        // Finding a product
        String productName = "Laptop";
        Product foundProduct = productDAO.find(productName);
        if (foundProduct != null) {
            System.out.println("\nFound product: " + foundProduct);
        } else {
            System.out.println("\nProduct not found with name: " + productName);
        }
    }
}
