public class InventoryManager {

    public void  addProduct(Product product){
        System.out.println("Product added successfully"+product.getName());
    }
    public void updateQuantity(String productName,int newQuantity){
        System.out.println("Product updated successfully: "+productName);
    }
    public void removeProduct(String productName){
        System.out.println("Product removed successfully: "+productName);
    }

}
