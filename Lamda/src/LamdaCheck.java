interface  Check{
    public int demo(int a);
}

public class LamdaCheck {

    public static void main(String [] args) {
        Check l1 =(a) -> {
          return (a*a*a);
        };
        Check l2=(a) -> {
            return  (a*a);
        };

        System.out.println("Cube of 5:"+l1.demo(5));
       System.out.println("Square of 6:"+l2.demo(6));
    }

}

