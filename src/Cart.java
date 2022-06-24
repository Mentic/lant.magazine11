import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products;
    public void addProduct(Product p1){
        if(products==null) {
            products = new ArrayList<>();
        }
        products.add(p1);
        }

    }

