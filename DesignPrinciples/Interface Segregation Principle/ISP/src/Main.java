import implementations.Book;
import implementations.EBook;
import implementations.Membership;
import interfaces.DigitalProduct;
import interfaces.PhysicalProduct;
import interfaces.Product;
import interfaces.SubscriptionProduct;

public class Main {

    private static void printProductDetails(Product product){
        System.out.println("Product: "+product.getName());
        System.out.println("Price: $"+product.getPrice());
        if (product instanceof PhysicalProduct physicalProduct){
            System.out.println("Weight: "+physicalProduct.getWeight()+" lbs");
            System.out.println("Shipping Address: "+physicalProduct.getShippingAddress());
        } else if (product instanceof DigitalProduct digitalProduct) {
            System.out.println("Download Link: "+digitalProduct.getDownloadLink());
        } else if (product instanceof SubscriptionProduct subscriptionProduct) {
            System.out.println("Subscription Duration: "+subscriptionProduct.getSubscriptionDuration()+" days");
            System.out.println("Auto-renewable: "+subscriptionProduct.isAutoRenewable());
        }
    }

    public static void main(String[] args) {
        Book book = new Book("The Art of Programming",29.99,2,"123 Main St");
        EBook eBook = new EBook("Java Programming 101",19.99,"http://example.com/java101");
        Membership membership = new Membership("Premium Subscription",9.99,30,true);

        printProductDetails(book);
        printProductDetails(eBook);
        printProductDetails(membership);
    }
}