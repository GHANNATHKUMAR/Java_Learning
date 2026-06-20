import java.util.Scanner;

public class Tracksheet44 {
    //Project - Guess Game
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int compugenerated = (int) (Math.random() * 100 + 1);
        int count = 0;
        int user;
        do {
            System.out.println("Enter number between 1 to 100");
            user = sc.nextInt(); // because bar bar loop chalega compare karne ke liye jab value daalenge baar baar toh
            if (compugenerated == user)
                System.out.println("CONGRATULATIONS " + "you got the number and number was  " + user);
            else if (user > compugenerated) {
                System.out.println("too high , try again");
            } else {
                System.out.println("too low , try again");
            }
            count++;
        } while (user != compugenerated && count <= 5); // count 5 lena matlab 5 bar mein tumhe guess kar lena ha number
        //Note : dekho assume karo 30 computer generate kake rakha hua hai , tumne dala 20 to too low dikhayega agar tumne daala
        // 40 toh too high dikhayega lekin yaani ye confirm hai ki no 20 se jayda hai aur 40 se chhota toh jarur hai
        // toh iska answer tum binary search karke bhi pata laga lega lekin chhoro jab padhenge tab samajh aayega
    }
}
