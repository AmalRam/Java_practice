interface SampleInterface{
    public int demo(int a,int b);
}
public class LamdaDemo {
    public  static void main (String [] args)
    {
       /* SampleInterface i= new SampleInterface() {
            @Override
            public int demo(int a, int b) {
                return a+b;
            }
        };*/

        // using lamda
        SampleInterface i= (a, b) -> {
            return a+b;
        };
        System.out.println("sum:"+i.demo(2,4));
    }

}

