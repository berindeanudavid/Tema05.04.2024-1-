public class CompensatedProduct extends Product{
    public CompensatedProduct(int code, String name, double basePrice, double coefficient){
        super(code,name,basePrice);
        this.price=this.basePrice*coefficient;
        this.coefficient=coefficient;
    }
}
