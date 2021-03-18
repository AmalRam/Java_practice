import java.util.Optional;
class Product{
    int pid;
    double price;
    String pname;
    public Product(int pid, double price, String pname) {
        this.pid = pid;
        this.price = price;
        this.pname = pname;
    }
    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", price=" + price +
                ", pname='" + pname + '\'' +
                '}';
    }
}
public class ProductArray {
    public static  void main(String [] ar){
        Product [] prodDetails = new Product[3];
      //  prodDetails[0]= new Product(1,20.2,"pencil");
     //   Optional<Product> checkNull = Optional.ofNullable(prodDetails[0]);
        //  System.out.println(prodDetails[0].toString());
     //   if(checkNull.isPresent()){
     //       System.out.println(prodDetails[0].toString());
   //     }
    //    else {
    //        System.out.println("product details is not present");
   //     }
    }
}
