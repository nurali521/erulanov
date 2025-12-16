public class Main{
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