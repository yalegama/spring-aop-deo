package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        System.out.println("This is Shopping Cart Class and running checkout method");
    }
}
