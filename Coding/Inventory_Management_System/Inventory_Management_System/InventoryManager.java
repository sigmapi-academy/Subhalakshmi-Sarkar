package Inventory_Management_System;
import Inventory_Management_System.Product;
import java.util.*;

public class InventoryManager {
    static Map<String, Product> products = new HashMap<>();
    static Comparator<Product> ascendingQuantity = (p1, p2) -> Integer.compare(p1.getQuantity(), p2.getQuantity());
    static PriorityQueue<Product> lowstock = new PriorityQueue<>(ascendingQuantity);

    public static void addProduct(Product p) {
        if (p.quantity < 5) {
            lowstock.add(p);
        } else {
            products.put(p.product_id, p);
        }
    }

    public static void updateQuantity(String id, int newQuantity) {
        Iterator<Product> iterate=lowstock.iterator();
        while(iterate.hasNext()){
            Product q=iterate.next();
            if(q.product_id==id){
                q.quantity=newQuantity;
            }
            if (q.quantity>5){
           
                products.put(q.product_id, q);
                lowstock.remove(q);
            }
        }
    }

    public static List<Product> getNLowestStockProducts(int n) {
        List<Product> lowestStockProducts = new ArrayList<>();
        Iterator<Product> iterator = lowstock.iterator();
        while (iterator.hasNext() && n > 0) {
            lowestStockProducts.add(iterator.next());
            n--;
        }
        return lowestStockProducts;
    }

    public static void getAllProductsSortedByPrice() {
         ((List<Product>) products.values()).sort(Comparator.comparing(Product::getPrice));      
    }

    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        addProduct(p1);
        addProduct(p2);
        addProduct(p3);
        addProduct(p4);

        System.out.println("Lowest stock products:");
        for (Product p : getNLowestStockProducts(2)) {
            System.out.println(p.product_id + ": " + p.name + ", Quantity: " + p.quantity);
        }

        updateQuantity("004", 6);
        System.out.println("Updated product with ID '004': " + products.get("004").name + ", Quantity: " + products.get("004").quantity);

        getAllProductsSortedByPrice();
        System.out.println("Products sorted by price:");
        for (Product p : products.values()) {
            System.out.println(p.product_id + ": " + p.name + ", Price: " + p.price);
        }
    }

}
