package Oops;

public class Aggregation {
    

    String name;
    String age;
    Address address;

    public Aggregation(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.println(name+" "+age+" "+address.addressName+" "+address.addressCity);
    }

    public static void main(String[] args) {
        
        
        Address ad1 = new Address("Parwati Puram","Gorakhpur");
        Address ad2 = new Address("Parwati Puram","Gorakhpur");


        Aggregation a1 = new Aggregation("Ashutosh", "27", ad1);
        Aggregation a2 = new Aggregation("Abhishek", "25", ad2);

        a1.display();
        a2.display();
    }

}
