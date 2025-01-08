package POO.Projecte;

import java.time.LocalTime;

public class Schedule {
    private LocalTime start;
    private LocalTime end;

    public Schedule(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
