package Task3;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Room room1=new Room(2,4,4);
        Room room2=new Room(3,6,6);
        Room room3=new Room(4,10,8);

        ArrayList<Room> rooms= new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        Building office= new Building(rooms,2,3,true);

        System.out.println("The total number of lamps "+ countLampsINBuilding(office));

        System.out.println(isNormal(office));


    }

    public static int countLampsINBuilding(Building office){
        int totalLamps=0;
        for(Room room:office.getRooms()){
            totalLamps+=room.getNumberOfLamps();
        }

        return totalLamps;
    }

    private static boolean isNormal(Building office){
        if(office.getNumberOfFloors()>=office.getRooms().size()){
            return true;
        }else {
            System.out.println("This is an odd building");
            return false;
        }

    }
}
