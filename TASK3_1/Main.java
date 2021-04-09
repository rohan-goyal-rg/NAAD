package TASK3_1;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product(100,"Mango");
        Product p2=new Product(80,"Orange");
        Product p3=new Product(60,"Pineapple");
        System.out.println(p1.equals(p2));

        SpecialProduct specialProduct= SpecialProduct.applyOffOnProduct(p1,10);
        System.out.println(specialProduct);
    }
}
