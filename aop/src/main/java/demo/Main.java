import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.Class);
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout();
    }
}
