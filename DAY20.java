public class DAY20 {
    int x = 5; // attribute 
  int y = 3; 
   final int Z = 10; // IT CANNOT BE CHNAGES AFTER INTIALIZE 
   String fname = "John";
  String lname = "Doe";
  int age = 24; 
  public static void  main(String args[]){
       DAY20 myObj = new DAY20();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);   // 25 
    System.out.println(myObj.Z); // 10 
    System.out.println(myObj.fname); //John 
  }
}
