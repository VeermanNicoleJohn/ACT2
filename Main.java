public class Main{

public static void main(String[] args){

Vehicle v1 = new Vehicle();
v1.brand = "Porsche";
v1.model = "911";
v1.year = 2001;

Vehicle v2 = new Vehicle();
v2.brand = "Bugatti";
v2.model = "Veyron";
v2.year = 500;

Vehicle v3 = new Vehicle();
v3.brand = "Ferrari";
v3.model = "250 GTO";
v3.year = 2022;

v1.displayInfo();
   System.out.println(v1.calculateAge());
   System.out.println(v1.isVintage());
v2.displayInfo();
   System.out.println(v2.calculateAge());
   System.out.println(v2.isVintage());
v3.displayInfo();
   System.out.println(v3.calculateAge());
   System.out.println(v3.isVintage());
   
}
}