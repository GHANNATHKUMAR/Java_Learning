//     A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created.
// It can be used to set initial values for object attributes:
public class DAY22 {
int x; 
public DAY22(int y){ // CONSTRUCTOR  
 x=y; // INTIALIZED PARAMTERS  
}
public static void main(String args[]){
        DAY22 myObj = new DAY22(5); 
    System.out.println(myObj.x); //5 
}
}
