
// accessing static methods using method references
/*
Method references can point to
1.static methods
2. constructors
3. instance methods [non static methods]
 */
interface  sampleInterface{
    void show(String g,String h);
}
public class MethodRefereceInstanceMethod{
    public  void print(String s,String t){
        System.out.println("Welcome " + s + t);
    }
    public void concat(String s1, String s2){
        System.out.println("Concatenated String is "+s1+s2);
    }
    public  void findAndReplace(String search, String replace){
        System.out.println("write code here  find and replace the strings ");
    }

    public void function1( String s1,String s2) {
        System.out.println("This is test Function..");
    }
    public static void main(String []  a){
        // calling directly
        MethodRefereceInstanceMethod obj =  new MethodRefereceInstanceMethod();
        obj.print("Parul","sehgal");
        //calling using method references
        sampleInterface s1 = obj::print;
        s1.show("Sunil", "K"); // invokes print ()
        s1 = obj::concat;
        s1.show("Sunil", "K"); // invokes concat()
        s1=obj::findAndReplace;
        s1.show("find "," java"); // invokes findAndReplace()
        s1=obj::function1;
        s1.show("Hello","World");
    }
}