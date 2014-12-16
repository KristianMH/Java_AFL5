import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
*
*
*/
public class CourseParser {
    private ArrayList<Course> courses;
    private String filename;

    public CourseParser(String fileName) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        for (String string : lines) {
            courses.add(new Course(string));
        }
    }

    public ArrayList getCourses() {
        return  courses;
    }
}
