import java.util.ArrayList;
import java.util.List;

public class Traveller {
    public int id;
    public  String travelType;
    public float price;

    public List locations=new <String>ArrayList();


    public Traveller() {
        id=0;
        travelType=null;
        price=0;
        locations=null;
    }

    public Traveller(int id) {
        this.id = id;
    }

    public Traveller(int id, String travelType) {
        this.id = id;
        this.travelType = travelType;
    }

    public Traveller(int id, String travelType, float price) {
        this.id = id;
        this.travelType = travelType;
        this.price = price;
    }

    public Traveller(int id, String travelType, float price, List locations) {
        this.id = id;
        this.travelType = travelType;
        this.price = price;
        this.locations = locations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List getLocations() {
        return locations;
    }

    public void setLocations(List locations) {
        this.locations = locations;
    }


    public String getTravellerDetails()
    {
        return "Traveller{ id"
                + id
                + ", travelType="
                + travelType
                + ", price="
                + price
                +"locations:"+locations+" }";

    }


    public  static void main (String [] args) {
        Traveller t1 =new Traveller();
        System.out.println(t1.getTravellerDetails());
        Traveller t2= new Traveller(1);
        System.out.println(t2.getTravellerDetails());
        Traveller t3= new Traveller(2, "air");
        System.out.println(t3.getTravellerDetails());
        Traveller t4= new Traveller(2, "air", 2000);
        System.out.println(t4.getTravellerDetails());
        List l = new ArrayList<String>();
        l.add("Chennai");
        l.add("Bangalore");
        Traveller t5 = new Traveller(300, "Air",8345,l);
        System.out.println(t5.getTravellerDetails());

    }
}
