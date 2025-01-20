package JavaTextbook;

import java.util.Scanner;

public class WiFiDiagnosticTree{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Troubleshooting WiFi Connectiion:");

        System.out.println("Step 1: Reboot the computer and try to connect and try to connect.");
        System.out.println("Did that fix the problem? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();

        if(response.equals("yes")){
            System.out.println("Problem solved!");
        } else {
            System.out.println("Step 2: Reboot the router and try to connect");
            System.out.println("Did that fix the problem? (yes/no)");
            response = scanner.nextLine().toLowerCase();

            if(response.equals("yes")) {
                System.out.println("Problem solved!");
            
            } else {
                System.out.println("Step 3: Make sure the cables between the router and modem are plugged in firmly.");
                System.out.println("Did that fix the problem? (yes/no)");
                response = scanner.nextLine().toLowerCase();

                if(response.equals("yes")){
                    System.out.println("Problem solved!");
                } else {
                    System.out.println("Step 4: Move the router to a new location and try to connect.");
                    System.out.println("Did that fix the problem? (yes/no)");
                    response = scanner.nextLine().toLowerCase();

                    if(response.equals("yes")){
                        System.out.println("Problem solved!");
                    } else {
                        System.out.println("Step 5: Get a new router.");
                        System.out.println("If that does not work, contact your Internet Service Provider.");
                    }
                }
            }
        }

        scanner.close();
    }
}

