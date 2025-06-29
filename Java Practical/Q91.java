import java.util.*;
class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}

public class Q91 {
    static Map<Integer, Boolean> rooms = new HashMap<>();
    static void reserveRoom(int roomNumber) throws RoomNotAvailableException {
        if (!rooms.containsKey(roomNumber))
            throw new RoomNotAvailableException("Room does not exist.");
        if (!rooms.get(roomNumber))
            throw new RoomNotAvailableException("Room already reserved.");
        rooms.put(roomNumber, false);
        System.out.println("Room " + roomNumber + " reserved successfully.");
    }

    public static void main(String[] args) {
        for (int i = 101; i <= 105; i++) {
            rooms.put(i, true); 
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room number to reserve: ");
        int roomNumber = sc.nextInt();

        try {
            reserveRoom(roomNumber);
        } catch (RoomNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
