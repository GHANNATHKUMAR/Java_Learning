import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write the program to accept rating of the movie as double and movie name as string
        check and print the category of movie based on rating
        Example
        Input
        4.9
        RRR
        OP-RRR is Super Hit
        Rating      | Message to be displayed
        0.0 to 2.0  | Flop
        2.1 to 3.4  | Semi-hit
        3.5 to 4.5  | Hit
        4.6 to 5.0  | Super Hit
        */
        System.out.println("INPUT");
        double rating = sc.nextDouble();
        String movie = sc.next();
        if (rating >= 0.0 && rating <= 2.0) {
            System.out.println("OP-" + movie + " is Flop");
        } else if (rating >= 2.1 && rating <= 3.4) {
            System.out.println("OP-" + movie + " is Semi-hit");
        } else if (rating >= 3.5 && rating <= 4.5) {
            System.out.println("OP-" + movie + " is Hit");
        } else if (rating >= 4.6 && rating <= 5.0) {
            System.out.println("OP-" + movie + " is Super-Hit");
        } else {
            System.out.println("INVALID INPUT RATING OF YOUR MOVIE");
        }
    }
}
