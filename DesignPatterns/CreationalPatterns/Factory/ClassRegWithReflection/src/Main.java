import java.util.HashMap;

abstract class Product{
    public abstract void performAction();
}

class ConcreteProduct1 extends Product{

    @Override
    public void performAction() {
        System.out.println("Concrete Product1 performing action");
    }
}

class ConcreteProduct2 extends Product{

    @Override
    public void performAction() {
        System.out.println("Concrete Product2 performing action");
    }
}

class ProductFactory{
    private HashMap<String, Class<? extends Product>> registeredProducts = new HashMap<>();

    public void registerProduct(String productId,Class<? extends Product> productClass){
        registeredProducts.put(productId,productClass);
    }
    public Product createProduct(String productId) throws Exception {
        Class<? extends Product> productClass = registeredProducts.get(productId);
        if (productClass != null)
            return productClass.getDeclaredConstructor().newInstance();
        return null;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        ProductFactory factory = new ProductFactory();
        factory.registerProduct("ID1",ConcreteProduct1.class);
        factory.registerProduct("ID2",ConcreteProduct2.class);

        Product product1 = factory.createProduct("ID1");
        if(product1!=null){
            product1.performAction();
        }
        Product product2 = factory.createProduct("ID2");
        if (product2!=null)
            product2.performAction();

    }
}