import java.util.Arrays;

public class DAY11 {
    public static void main(String args[]) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5); // at least one time do loop will run..

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }

        for (i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        for (i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);

        }
    }
}
