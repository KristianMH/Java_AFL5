import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class RoomParser {
    private ArrayList<Room> rooms;
    private String filename;

    public RoomParser(String fileName) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        for (String string : lines) {
            rooms.add(new Room(string));
        }
    }

    public ArrayList getRooms() {
        return  rooms;
    }
}
