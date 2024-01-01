public class NotificationService {

    public void notifyLowStock(Product product){
        System.out.println("Stock is not present"+product.getName());
    }
}
