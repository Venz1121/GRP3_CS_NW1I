import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GRP3_CS_NW1I {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declare/Initialize variables
        String user;
        String choice;
        String name[][] = new String[100][3];
        double fare[][] = new double[100][3];
        int dest = 0;
        int done = 0;
        int b = 0;
        int passenger[][] = new int[100][4]; // Added an extra column for PWD, Senior, and Student
        String destination[] = {" ","Abucay", "Bagac", "Dinalupihan", "Hermosa", "Limay", "Mariveles", "Morong", "Orani", "Orion", "Pilar", "Samal"};
        double price[] = {0, 15, 50, 35, 30, 45, 60, 55, 30, 25, 15, 30};

        System.out.println("----------------------------------------");
        System.out.println("-----Welcome to Balanga Bus Travel Hubs!------");
        System.out.println("--------Your One-Way Trip Ride!---------");
        System.out.println("----------------------------------------");
        System.out.println("");
        // Ask the user to enter "Start" to continue
        System.out.println("Please Enter Start");
        user = br.readLine();
        while (!user.equalsIgnoreCase("Start")) {
            System.out.println("Try Again:<");
            System.out.println("Enter: Start");
            user = br.readLine();
        }
        for (int a = 1; a == 1;) {// The Main Menu
            System.out.println("----------------------------------");
            System.out.println("--- Balanga Bus Travel Hubs: Menu ------");
            System.out.println("----------------------------------");
            System.out.println("-- [1] Destination        --------");
            System.out.println("-- [2] Buy Ticket         --------");
            System.out.println("-- [3] Exit               --------");
            System.out.println("----------------------------------");

            for (a = 1; a == 1;) {// Ask the user to enter his/her choice
                System.out.print("Enter your choice: ");
                choice = br.readLine();

                switch (choice) {
                    case "1" -> {
                        System.out.println("\n----------------------------------");
                        System.out.println("--------Destinations--------------");
                        System.out.println("----------------------------------");
                        System.out.println("-- [1] Abucay          | Php 15   ----");
                        System.out.println("-- [2] Bagac           | Php 50   ----");
                        System.out.println("-- [3] Dinalupihan     | Php 35   ----");
                        System.out.println("-- [4] Hermosa         | Php 30   ----");
                        System.out.println("-- [5] Limay           | Php 45   ----");
                        System.out.println("-- [6] Mariveles       | Php 60   ----");
                        System.out.println("-- [7] Morong          | Php 55   ----");
                        System.out.println("-- [8] Orani           | Php 30   ----");
                        System.out.println("-- [9] Orion           | Php 25   ----");
                        System.out.println("-- [10] Pilar          | Php 15   ----");
                        System.out.println("-- [11] Samal          | Php 30   ----");
                        System.out.println("Please Choose other options in The Main Menu.");
                    }
                    case "2" -> {
                        int pass = 1;
                        System.out.println("----------------------------------");
                        System.out.println("------------Buy tickets-----------");
                        System.out.println("----------------------------------");
                        System.out.println("--Destinations--------Price-------");
                        System.out.println("----------------------------------");
                        System.out.println("-- [1] Abucay          | Php 15   ----");
                        System.out.println("-- [2] Bagac           | Php 50   ----");
                        System.out.println("-- [3] Dinalupihan     | Php 35   ----");
                        System.out.println("-- [4] Hermosa         | Php 30   ----");
                        System.out.println("-- [5] Limay           | Php 45   ----");
                        System.out.println("-- [6] Mariveles       | Php 60   ----");
                        System.out.println("-- [7] Morong          | Php 55   ----");
                        System.out.println("-- [8] Orani           | Php 30   ----");
                        System.out.println("-- [9] Orion           | Php 25   ----");
                        System.out.println("-- [10] Pilar          | Php 15   ----");
                        System.out.println("-- [11] Samal          | Php 30   ----");
                        System.out.println("----------------------------------");

                        for (a = 1; a == 1;) {// Ask the user to enter his/her name
                            System.out.println("Enter your name.");
                            name[b][0] = br.readLine();

                            for (a = 1; a == 1;) {// Ask the user to enter his/her destination
                                System.out.println("Enter chosen destination (1 - 11).");
                                dest = Integer.parseInt(br.readLine());
                                if (dest < 1 || dest > 11) {
                                    System.out.println("Invalid Input!");
                                }

                                // Converted integer to string, transfer to storage array//
                                name[b][1] = destination[dest];
                                fare[b][0] = price[dest];

                                for (a = 1; a == 1;) { // Ask the user to enter how many are they
                                    System.out.print("How Many Passengers: ");
                                    passenger[b][0] = Integer.parseInt(br.readLine());

                                    // Additional questions for PWD, Senior, Student
                                    System.out.print("How Many PWD Passengers: ");
                                    passenger[b][1] = Integer.parseInt(br.readLine());
                                    System.out.print("How Many Senior Passengers: ");
                                    passenger[b][2] = Integer.parseInt(br.readLine());
                                    System.out.print("How Many Student Passengers: ");
                                    passenger[b][3] = Integer.parseInt(br.readLine());

                                    for (int c = 1; c <= 1; c++) {
                                        if (dest == c) {
                                            pass = 1;
                                        } else {
                                            a = 0;
                                        }
                                        if (pass == 1) {// Display
                                            System.out.println("----------------------------------------");
                                            System.out.println("-------   PASSENGER'S DETAILS   --------");
                                            System.out.println("----------------------------------------");
                                            System.out.println("-------PASSENGER'S NAME: " + name[b][0] + "----------");
                                            System.out.println("-------DESTINATION: " + name[b][1] + "----------");
                                            System.out.println("-------ORIGINAL FARE PRICE: Php" + fare[b][0] * passenger[b][0] + "----------");

                                            // Calculate discounted price
                                            double discountedPrice = calculateDiscountedPrice(fare[b][0], passenger[b][0], passenger[b][1], passenger[b][2], passenger[b][3]);
                                            System.out.println("-------DISCOUNTED PRICE: Php" + discountedPrice + "----------");

                                            System.out.println("-------NO. OF PASSENGERS: " + passenger[b][0] + "----------");
                                            System.out.println("----------------------------------------");
                                            name[b][2] = "0";
                                            a = 0;
                                            System.out.println("Please save a screenshot for proof of purchase!");
                                            System.out.println("Thank you for using our system! Have a Blessed day!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    case "3" -> {
                        done = 0;
                        a = 0;
                        System.out.println("Thank you for using our system! Have a Blessed day!");
                    }
                    default -> {
                    }
                }
            }
        }
    }

    // Method to calculate the discounted price
    private static double calculateDiscountedPrice(double originalFare, int totalPassengers, int pwdCount, int seniorCount, int studentCount) {
        // Assuming discounts are 20% for PWD, 30% for Senior, and 25% for Student
        double pwdDiscount = 0.20;
        double seniorDiscount = 0.30;
        double studentDiscount = 0.25;

        double discountedFare = originalFare * totalPassengers; // Initialize with the original fare

        // Apply discounts
        discountedFare -= originalFare * pwdCount * pwdDiscount;
        discountedFare -= originalFare * seniorCount * seniorDiscount;
        discountedFare -= originalFare * studentCount * studentDiscount;

        return discountedFare;
    }
}
