public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop","Powerful laptop",999.99,10);
        InventoryManager inventoryManager = new InventoryManager();
        NotificationService notificationService = new NotificationService();

        inventoryManager.addProduct(laptop);
        inventoryManager.updateQuantity("Laptop",5);
        inventoryManager.removeProduct("Laptop");
        if (laptop.getQuantity()<5){
            notificationService.notifyLowStock(laptop);
        }
    }
}
