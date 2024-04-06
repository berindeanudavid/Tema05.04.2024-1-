public class UncompensatedProduct extends Product{
    public UncompensatedProduct(int code, String name, double basePrice){
        super(code, name, basePrice);
        this.price=this.basePrice;
        this.coefficient=1.00;
    }
}
