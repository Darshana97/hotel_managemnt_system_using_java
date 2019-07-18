import java.util.Scanner;

public class Hotel {

    Room[] rooms = new Room[10];

    public Hotel() {
        for (int i=0;i<10;i++){
            Room room=new Room(i+1);
            rooms[i]=room;
        }
    }

    public boolean addCustomer(int roomNumber, Customer customer){

        if (!rooms[roomNumber-1].isOccupied()){
            this.rooms[roomNumber-1].setCustomer(customer);
            return true;
        }
        return false;

    }

    public void viewAllRooms(){
        for (int i=0;i<10;i++){
            String occupied = rooms[i].isOccupied()? "Room is Occupied":"Room is Empty";
            System.out.println("Room "+(i+1)+" "+occupied);
        }
    }

    public void deleteCustomer(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the room number: ");
        int x = sc.nextInt();

        sc.remove();



    }
}
