public class Event {
    private Course course;
    private Time time;
    private Day day;
    private Room room;

    public Event(String event) {
        String[] arr = event.split(" ");
        this.course = new Course(arr[0]);
        this.room = new Room(arr[1]);
        this.day = new Day(arr[2]);
        this.time = new Time(arr[3]);
    }

    public Course getCourse() {
        return this.course;
    }

    public Time getTime() {
        return this.time;
    }

    public Day getDay() {
        return this.day;
    }

    public Room getRoom() {
        return this.room;
    }

}
