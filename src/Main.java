import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> produs = new ArrayList<>();
        Product p1= new Product();
        p1.id=15;
        p1.name="egg";
        p1.price=150;
        p1.color="white";
        Product p2=new Product();
        p2.id=20;
        p2.name="milk";
        p2.price=180;
        p2.color="gray";
        Product p3=new Product();
        p3.id=8;
        p3.name="sugar";
        p3.price=200;
        p3.color="pink";
        
        //aici adaugi tu produsele de acum, nu le mai adaugi in lista de mai sus, ca ele trebuie adaugate intr-o lista a unui cart
        
        Cart c = new Cart();
        c.addProduct(p1);
    }
}
