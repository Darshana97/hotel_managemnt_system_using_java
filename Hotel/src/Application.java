import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Hotel hotel=new Hotel();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t ****** Welcome To Hotel ABC ******");

        boolean running=true;

        while (running) {
            System.out.println("Please select an option\n");
            System.out.println("A - Add new customer");
            System.out.println("V - View all rooms\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "A":
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();

                    Customer customer = new Customer(name);

                    boolean registratonSuccess = hotel.addCustomer(roomNumber, customer);
                    if (registratonSuccess) {
                        System.out.println("New Customer sucessfully added!");
                    } else {
                        System.out.println("Sorry!, Room is occupied.");
                    }
                    break;

                case "V":
                    hotel.viewAllRooms();
                    break;
                case "E":
                    running=false;
                    break;

                case "D":
                    hotel.deleteCustomer();
                    break;


            }

        }

    }

}
