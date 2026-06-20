// custom checked exception right yes
class InvalidAgeException1 extends Exception {
    InvalidAgeException1(String message ){
        super(message);
    }
}
public class endsem9 {
    public static void main(String[] args) {
        try{
            validateage(-5);
        }
        catch(InvalidAgeException1 e){
            System.out.println("hello handled"+e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
    public static void validateage(int age) throws InvalidAgeException1{
        if(age<0 || age>150) {
            throw new InvalidAgeException1("invalid age : "+age);
        }
        System.out.println("age is valid " + age);
    }
}
