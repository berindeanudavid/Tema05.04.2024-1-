import java.util.ArrayList;
public class Product {
    public int code;
    public String name;
    public double basePrice;
    public int quantity;
    public double price;
    //Este necesara folosirea polimorfismului pentru pret deoarece pretul depinde de tipul de produs.
    //Fara folosirea polimorfismului in acest caz, am avea aceeasi formula pentru pret.
    public double coefficient;
    //Coeficientul este declarat in Product pentru o functionare mai eficienta a metodei de adaugare in depozit.
    //Coeficientul pentru produsele necompensate va fi 1.00.
    public static ArrayList<Product> deposit;
    public Product(int code, String name, double basePrice){
        this.code=code;
        this.name=name;
        this.basePrice=basePrice;
        this.quantity=1;
    }
    public boolean equals(Product p){
        if(this.name.equals(p.name)&&this.price==p.price)
            return true;
        return false;
    }
    public String toString(){
        return name;
    }
    public void addToDeposit(){
        boolean isNot=true;
        for(int i=0;i<deposit.size();i++){
            //Instanta este comparata cu fiecare produs din depozit pana cand se gaseste o echivalenta* sau nu se mai gasesc produse.
            //*In acest caz, echivalenta este atunci cand 2 produse sunt compensate in aceeasi masura si au acelasi cod de produs.
            if(deposit.get(i).coefficient==this.coefficient&&deposit.get(i).code==this.code){
                isNot=false;
                deposit.get(i).quantity++;
                break;
            }
        }
        if(isNot){
            deposit.add(this);
        }
    }
}