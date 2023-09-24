import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        System.out.println("Shopping cart from checkout method called");
    }
}
