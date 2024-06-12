package CLASE24;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void createTask(String description, LocalDate dueDate) {
        tasks.add(new Task(description, dueDate));
    }

    public void completeTask(int id) {
        // Find the task and complete it
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.complete();
                break;
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void editTaskDescription(int id, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setDescription(newDescription);
                break;
            }
        }
    }
    public List<Task> obtenerTareas() {
        return tasks;
    }

    public Duration getTotalWorkTime() {
        return tasks.stream()
                .filter(task -> task.getEndTime() != null)
                .map(Task::getDuration)
                .reduce(Duration::plus)
                .orElse(Duration.ZERO);
    }

    public List<Task> searchTasks(String description) {
        return tasks.stream()
                .filter(task -> task.getDescription().contains(description))
                .collect(Collectors.toList());
    }

    public void sortTasks(String criteria) {
        Comparator<Task> comparator;
        switch (criteria) {
            case "description":
                comparator = Comparator.comparing(Task::getDescription);
                break;
            case "startTime":
                comparator = Comparator.comparing(Task::getStartTime);
                break;
            case "id":
                comparator = Comparator.comparing(Task::getId);
                break;
            case "dueDate":
                comparator = Comparator.comparing(Task::getDueDate);
                break;
            case "endTime":
                comparator = Comparator.comparing(Task::getEndTime, Comparator.nullsLast(Comparator.naturalOrder()));
                break;
            default:
                throw new IllegalArgumentException("Invalid sort criteria: " + criteria);
        }
        tasks.sort(comparator);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
