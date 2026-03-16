import java.lang.reflect.Method;

public class DAY17 {
    //Java Scope
// In Java, variables are only accessible inside the region where they are created. This is called scope. 
// Method Scope
// Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared: 
public static void main(String args[]){
    int x = 100;
    // Code here CAN use x
    System.out.println(x);

//     Block Scope
// A block of code refers to all of the code between curly braces { }.

// Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared:
for(int i=0;i<5;i++){
    int x1 = 100;
      // Code here CAN use x
      System.out.println(x1); 
}

}
}
