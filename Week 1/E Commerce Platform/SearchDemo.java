import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    
    public static void main(String[] args) {
        Product[] products = {
            new Product(104, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(103, "Book", "Education"),
            new Product(102, "Phone", "Electronics")
        };

        
        System.out.println("=== Linear Search ===");
        Product result1 = linearSearch(products, 103);
        System.out.println(result1 != null ? result1 : "Product not found.");

        
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        
        System.out.println("\n=== Binary Search ===");
        Product result2 = binarySearch(products, 103);
        System.out.println(result2 != null ? result2 : "Product not found.");
    }
}
