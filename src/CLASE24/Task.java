package CLASE24;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task {
    private static int counter = 0;

    private int id;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDate dueDate;

    public Task(String description, LocalDate dueDate) {
        this.id = ++counter;
        this.description = description;
        this.startTime = LocalDateTime.now();
        this.dueDate = dueDate;
    }

    public void complete() {
        this.endTime = LocalDateTime.now();
    }

    public Duration getDuration() {
        LocalDateTime end = (endTime != null) ? endTime : LocalDateTime.now();
        return Duration.between(startTime, end);
    }

    public long getDaysUntilDue() {
        return ChronoUnit.DAYS.between(LocalDate.now(), dueDate);
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}

