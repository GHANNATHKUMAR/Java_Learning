public class endsem6 {
    public static void main(String[] args) {
        try{
            divide(10,0);
            throw new ArithmeticException("hello");
        }
        catch (ArithmeticException e){
            System.out.println("handled this "+e.getMessage());
        }
        finally{
            System.out.println("hello done ");
        }
        System.out.println("hello ghannath");
        try{
            throwOne();
        }
        catch (IllegalAccessException e){
            System.out.println("done \n"+e.getMessage());
        }
        finally {
            System.out.println("done");
        }
    }
//    static void throwOne() throws ArithmeticException{
//        System.out.println("inside throwone");
//       throw new ArithmeticException("done it ");
//    }
    static  void throwOne() throws IllegalAccessException{
        System.out.println("inside throwone");
        throw new IllegalAccessException("demo");
    }
    static void divide(int a,int b){
        System.out.println(a/b);
    }
}
