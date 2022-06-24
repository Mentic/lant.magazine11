import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products;
    Discount d ;
    public void addProduct(Product p1){
        if(products==null) {
            products = new ArrayList<>();
        }
        products.add(p1);
        }

    }
    public applyDiscount(){
        if(d.fixedDiscount > 0 ) {
         //aici inseamna ca ai field-ul fixedDiscount -- deci trebuie aplicat discount pe totaului liste de produse de mai sus   
        }
        if(d.PercentageDiscount > 0) {
                     //aici inseamna ca ai field-ul PercentageDiscount -- deci trebuie aplicat discount pe totaului liste de produse de mai sus dar ca suma, nu ca procent  

        }
    }

}
