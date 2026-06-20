class NegativeBalanceException  extends RuntimeException{
    NegativeBalanceException(String message){
        super(message);
    }
}
public class endsem10 {
    public static void main(String[] args) {
        try{
            withdraw(50,20);
        }
        catch(NegativeBalanceException e){
            System.out.println("hello "+e.getMessage());
        }
        finally {
            System.out.println("hello done dada");
        }
        System.out.println("hello ghannath sir ");
    }
    public static void withdraw(int amount,int balance){
        if(amount>balance) {
            throw new NegativeBalanceException ("insufficient balance for withdral "+balance);
        }
        System.out.println("withdrawl successful "+(balance-amount));
    }
}
