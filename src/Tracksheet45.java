import java.util.Scanner;

public class Tracksheet45 {
    //Project - Restaurant v1.0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        do {
            System.out.println(" Enter 1. for Indian food ");
            System.out.println(" Enter 2. for Italy food ");
            System.out.println(" Enter 3. for Russian food ");
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Welcome to Indian food ");
                    System.out.println("please choose your dishes in Indian food");
                    System.out.println("Enter 1 for LITTY CHOKHA ");
                    System.out.println("Enter 2 for DAAL BAATI");
                    System.out.println("Enter 3 for POORI CHOKHA ");
                    int d = sc.nextInt();
                    switch (d) {
                        case 1: {
                            total += 500;
                            break;
                        }
                        case 2: {
                            total += 300;
                            break;
                        }
                        case 3: {
                            total += 2900;
                            break;
                        }
                        default: {
                            System.out.println("No food has been selected ");
                        }

                    }
                    System.out.println("total price is " + total);
                    break;
                }
                case 2: {
                    System.out.println("Welcome to Italy food food ");
                    System.out.println("please choose your dishes in Italian food");
                    System.out.println("Enter 1 for Dhosha");
                    System.out.println("Enter 2 for ghuchka");
                    System.out.println("Enter 3 for Paneer ");
                    int d = sc.nextInt();
                    switch (d) {
                        case 1: {
                            total += 700;
                            break;
                        }
                        case 2: {
                            total += 800;
                            break;
                        }
                        case 3: {
                            total += 1900;
                            break;
                        }
                        default: {
                            System.out.println("No food has been selected ");
                        }

                    }
                    System.out.println("total price is " + total);
                    break;
                }
                case 3: {
                    System.out.println("Welcome to Russian  food ");
                    System.out.println("please choose your dishes in Indian food");
                    System.out.println("Enter 1 for ");
                    System.out.println("Enter 2 for bhujia");
                    System.out.println("Enter 3 for POORiya ");
                    int d = sc.nextInt();
                    switch (d) {
                        case 1: {
                            total += 800;
                            break;
                        }
                        case 2: {
                            total += 900;
                            break;
                        }
                        case 3: {
                            total += 1900;
                            break;
                        }
                        default: {
                            System.out.println("No food has been selected ");
                        }

                    }
                    System.out.println("total price is " + total);
                    break;
                }
                default: {
                    System.out.println("Invalid country code for food or not availabale");
                }

            }

        } while (true);
    }
}

