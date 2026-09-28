public class Main{

public static void main(String[] args){

Vehicle v1 = new Vehicle("Porsche", "911", 2001);
Vehicle v2 = new Vehicle("Bugatti", "Veyron", 500);
Vehicle v3 = new Vehicle("Ferrari", "250 GTO", 2022);

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