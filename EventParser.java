import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EventParser {
    private ArrayList<Event> events;
    private String filename;

    public EventParser(String fileName) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        for (String string : lines) {
            events.add(new Event(string));
        }
    }

    public ArrayList getEvents() {
        return  events;
    }
}
