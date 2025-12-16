public class Inventory {
    Product product;
    Supplier supplier;
    int quantity;

    Inventory(Product product,Supplier supplier, int quantity){
        this.product = product;
        this.supplier = supplier;
        this.quantity = quantity;
    }
    int getQuantity(){
        return quantity;
    }
    void showInfo(){
        System.out.println(product.getName() +
                "  Supplier:" + supplier.getName() +
                "  Quantity:" + quantity);
    }
}
