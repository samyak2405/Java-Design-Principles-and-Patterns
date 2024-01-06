import java.util.HashMap;

abstract class Product{
    public abstract void performAction();
}

class ConcreteProduct1 extends Product{

    @Override
    public void performAction() {
        System.out.println("ConcreteProduct1 is performing an action.");
    }
}

class ConcreteProduct2 extends Product{

    @Override
    public void performAction() {
        System.out.println("ConcreteProduct2 is performing an action.");
    }
}
class ProductFactory{
    private static final ProductFactory instance = new ProductFactory();
    private HashMap<String ,Product> registeredProducts = new HashMap<>();

    public static ProductFactory instance(){
        return instance;
    }
    public void registerProduct(String productId,Product product){
        registeredProducts.put(productId,product);
    }
    public Product createProduct(String productId){
        Product prototype = registeredProducts.get(productId);
        if (prototype!=null){
            try {
                return prototype.getClass().getDeclaredConstructor().newInstance();
            }catch (Exception e){
                e.getMessage();
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        ProductFactory.instance().registerProduct("ID1",new ConcreteProduct1());
        ProductFactory.instance().registerProduct("ID2",new ConcreteProduct2());
        Product product = ProductFactory.instance().createProduct("ID1");
        if (product!=null){
            product.performAction();
        }

        Product product1 = ProductFactory.instance().createProduct("ID2");
        if (product1!=null){
            product1.performAction();
        }

    }
}