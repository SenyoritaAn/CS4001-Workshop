import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Distance (km): ");
        double km = sc.nextDouble();

        System.out.print("Time (minutes): ");
        double min = sc.nextDouble();

        System.out.print("Local? (yes/no): ");
        String local = sc.next();

        System.out.print("Night time? (yes/no): ");
        String night = sc.next();

        // ternary operator
        boolean isLocal = local.equalsIgnoreCase("yes") ? true : false;
        boolean isNight = night.equalsIgnoreCase("yes") ? true : false;

        double fare = 50 + (km * 20) + (min * 2); 

        if (isLocal && km > 10) {
            fare = fare - (fare * 0.10);
        }

        if (isNight) {
            fare = fare + (fare * 0.15); 
        }

        System.out.println("Final Fare: Rs. " + (int)fare);
        
    }
}
