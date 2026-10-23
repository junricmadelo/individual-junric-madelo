package com.joysistvi.day8;

import java.util.Scanner;

public class Activity5_Madelo {

    // Reads a line and converts it to an int. Returns -1 if the input is not a number.
    static int readChoice(Scanner sc) {
        System.out.print("Enter a choice: ");
        String input = sc.nextLine().trim();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            // Step 1: USSD code
            String code;
            System.out.println("Dial *143# to access Globe Services");
            do {
                System.out.print("Enter USSD Code: ");
                code = sc.nextLine().trim();
                if (!code.equals("*143#")) {
                    System.out.println("Invalid USSD code. Please try again.");
                }
            } while (!code.equals("*143#"));

            // Step 2: Main menu
            int mainChoice;
            do {
                System.out.println();
                System.out.println("        * Load Registration *");
                System.out.println("    [1] Go+");
                System.out.println("    [2] Go");
                System.out.println("    [3] GoEXTRA");
                System.out.println("    [4] UNLI 5G");
                System.out.println("    [5] ALLNET");
                mainChoice = readChoice(sc);
                if (mainChoice < 1 || mainChoice > 5) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } while (mainChoice < 1 || mainChoice > 5);

            // Step 3: Promo sub-menu
            String category = "";
            String promo1 = "", promo2 = "", promo3 = "";
            String details1 = "", details2 = "", details3 = "";

            switch (mainChoice) {
                case 1:
                    category = "Go+";
                    promo1 = "Go+99";
                    promo2 = "Go+129";
                    promo3 = "Go+149";
                    details1 = "Get 8 GB for all sites + 8GB";
                    details2 = "Get 10 GB for all sites + 10GB";
                    details3 = "Get 12 GB for all sites + 12GB";
                    break;
                case 2:
                    category = "Go";
                    promo1 = "Go50";
                    promo2 = "Go90";
                    promo3 = "Go120";
                    details1 = "Get 5 GB for all sites";
                    details2 = "Get 8 GB for all sites";
                    details3 = "Get 10 GB for all sites";
                    break;
                case 3:
                    category = "GoEXTRA";
                    promo1 = "GoEXTRA99";
                    promo2 = "GoEXTRA129";
                    promo3 = "GoEXTRA149";
                    details1 = "Get 8 GB for all sites + 2 GB for GOMO apps";
                    details2 = "Get 10 GB for all sites + 3 GB for GOMO apps";
                    details3 = "Get 12 GB for all sites + 4 GB for GOMO apps";
                    break;
                case 4:
                    category = "UNLI 5G";
                    promo1 = "UNLI 5G 99";
                    promo2 = "UNLI 5G 149";
                    promo3 = "UNLI 5G 199";
                    details1 = "Get unlimited 5G data for 7 days";
                    details2 = "Get unlimited 5G data for 15 days";
                    details3 = "Get unlimited 5G data for 30 days";
                    break;
                case 5:
                    category = "ALLNET";
                    promo1 = "ALLNET99";
                    promo2 = "ALLNET149";
                    promo3 = "ALLNET199";
                    details1 = "Get unlimited texts to all networks + 5 GB data";
                    details2 = "Get unlimited texts to all networks + 8 GB data";
                    details3 = "Get unlimited texts to all networks + 12 GB data";
                    break;
            }

            int promoChoice;
            do {
                System.out.println();
                System.out.println("        *** " + category + " Promos ***");
                System.out.println("    [1] " + promo1);
                System.out.println("    [2] " + promo2);
                System.out.println("    [3] " + promo3);
                promoChoice = readChoice(sc);
                if (promoChoice < 1 || promoChoice > 3) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } while (promoChoice < 1 || promoChoice > 3);

            String promoName;
            String promoDetails;
            if (promoChoice == 1) {
                promoName = promo1;
                promoDetails = details1;
            } else if (promoChoice == 2) {
                promoName = promo2;
                promoDetails = details2;
            } else {
                promoName = promo3;
                promoDetails = details3;
            }

            // Step 4: Promo details and action menu
            int actionChoice;
            do {
                System.out.println();
                System.out.println("        *** " + promoName + " Promo ***");
                System.out.println("-> " + promoDetails);
                System.out.println("    [1] Subscribe");
                System.out.println("    [2] Exit");
                actionChoice = readChoice(sc);
                if (actionChoice != 1 && actionChoice != 2) {
                    System.out.println("Invalid choice. Please try again.");
                }
            } while (actionChoice != 1 && actionChoice != 2);

            if (actionChoice == 1) {
                System.out.println();
                System.out.println("You are now subscribed to " + promoName);
                running = false;   // Subscribe ends the program
            } else {
                System.out.println();   // Exit goes back to the USSD code prompt
            }
        }

        sc.close();
    }
}



