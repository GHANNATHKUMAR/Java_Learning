public class Lab7_4 {
    public static void main(String[] args) {

        int[][] theater = new int[4][];
        // Initialize each row with different number of seats
        theater[0] = new int[5];  // Row 1 with 5 seats
        theater[1] = new int[7];  // Row 2 with 7 seats
        theater[2] = new int[6];  // Row 3 with 6 seats
        theater[3] = new int[4];  // Row 4 with 4 seats
        theater[0][1] = 1;
        theater[0][3] = 1;
        theater[1][0] = 1;
        theater[1][4] = 1;
        theater[1][6] = 1;
        theater[2][2] = 1;
        theater[2][5] = 1;
        theater[3][1] = 1;
        // Step 3: Display the seating arrangement
        System.out.println("Movie Theater Seating Arrangement:");
        for (int row = 0; row < theater.length; row++) {
            System.out.print("Row " + (row + 1) + ": ");
            for (int seat = 0; seat < theater[row].length; seat++) {
                System.out.print("[" + theater[row][seat] + "] ");
            }
            System.out.println();
        }
    }
}

