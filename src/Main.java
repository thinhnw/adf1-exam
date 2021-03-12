import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Hotel[] hotels;

    public static void main(String[] args) {

        hotels = new Hotel[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter hotels' details:");
        for (int i = 0; i < 10; ++i) {
            System.out.println("Hotel " + (i + 1) + ":");
            System.out.print("name = ");
            String name = scanner.next();
            System.out.print("location = ");
            String location = scanner.next();
            System.out.print("ownerName = ");
            String ownerName = scanner.next();
            hotels[i] = new Hotel(name, location, ownerName);
        }

        System.out.print("Enter owner name = ");
        String ownerName = scanner.next();
        searchByOwnerName(ownerName);

        scanner.close();
    }

    public static void searchByOwnerName(String ownerName) {
        System.out.println("All hotels of " + ownerName + ":");
        for (Hotel hotel: hotels) {
            if (hotel.ownerName.equals(ownerName)) {
                System.out.println(hotel.toString());
            }
        }
    }
}
