class Product{
    String name;
    double price;

    Product(String name,double price ){
        this.name = name;
        this.price = price;
    }
    String getName(){
        return name;
    }
    double getPrice(){
        return price ;
    }
}

class Supplier{
    String name;

    Supplier(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
class Inventory{
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
 public class Student{
    public static void main(String[] args){
        Product p1 = new Product("Laptop" , 700);
        Product p2 = new Product("Monitor", 300);
        Product p3 =  new Product("Mouse",150);

        Supplier s1 = new Supplier("Asus");

        Inventory i1 = new Inventory(p1,s1,4);
        Inventory i2= new Inventory(p2,s1,10);
        Inventory i3 = new Inventory(p3,s1,20);

        i1.showInfo();
        i2.showInfo();
        i3.showInfo();
        if (i1.getQuantity()> i2.getQuantity() && i1.getQuantity()>i3.getQuantity()){
            System.out.println("More laptop in stock");
       }
        else if (i2.getQuantity()> i1.getQuantity()&& i2.getQuantity()>i3.getQuantity()){
            System.out.println("More monitor in stock");
        }
        else {
            System.out.println("More mouse in stock");
        }
    }
 }