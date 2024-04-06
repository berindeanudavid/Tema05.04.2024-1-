import java.util.ArrayList;
public class Client {
    public static void main(String[]args){
        Product.deposit=new ArrayList<>();
        Product p1=new UncompensatedProduct(4003, "ardei", 15.00);
        Product p2=new CompensatedProduct(4003, "ardei", 15.00, 0.25);
        Product p3=new CompensatedProduct(4002, "steak", 35.00, 0.10);
        Product p4=new CompensatedProduct(4003, "ardei", 15.00, 0.25);
        Product p5=new CompensatedProduct(4003, "ardei", 15.00, 0.25);
        Product p6=new CompensatedProduct(4003, "ardei", 15.00, 0.50);
        p1.addToDeposit();
        p2.addToDeposit();
        p3.addToDeposit();
        p4.addToDeposit();
        p5.addToDeposit();
        p6.addToDeposit();
        for(Product p:Product.deposit){
            System.out.println(p);
        }
    }
}
