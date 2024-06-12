package CLASE24;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Ejemplo de uso
        manager.createTask("Hacer ejercicio", LocalDate.now().plusDays(3));
        manager.createTask("Estudiar para el examen", LocalDate.now().plusDays(5));

        // Finalizar una tarea
        manager.completeTask(1);

        // Ver todas las tareas
        List<Task> tareas = manager.getTasks();
        for (Task tarea : tareas) {
            System.out.println("ID: " + tarea.getId() +
                    ", Descripción: " + tarea.getDescription() +
                    ", Inicio: " + tarea.getStartTime() +
                    ", Vencimiento: " + tarea.getDueDate() +
                    ", Finalización: " + (tarea.getEndTime() != null ? tarea.getEndTime() : "No finalizada") +
                    ", Duración (minutos): " + tarea.getDuration().toMinutes());
        }

        // Calcular tiempo total de trabajo
        System.out.println("Tiempo total de trabajo: " + manager.getTotalWorkTime().toMinutes() + " minutos");

        // Buscar tareas por descripción
        List<Task> tareasEncontradas = manager.searchTasks("examen");
        System.out.println("Tareas encontradas:");
        for (Task tarea : tareasEncontradas) {
            System.out.println("ID: " + tarea.getId() +
                    ", Descripción: " + tarea.getDescription() +
                    ", Inicio: " + tarea.getStartTime() +
                    ", Vencimiento: " + tarea.getDueDate() +
                    ", Finalización: " + (tarea.getEndTime() != null ? tarea.getEndTime() : "No finalizada") +
                    ", Duración (minutos): " + tarea.getDuration().toMinutes());
        }

        // Ordenar tareas por fecha de vencimiento
        manager.sortTasks("dueDate");
        System.out.println("Tareas ordenadas por fecha de vencimiento:");
        for (Task tarea : tareas) {
            System.out.println("ID: " + tarea.getId() +
                    ", Descripción: " + tarea.getDescription() +
                    ", Inicio: " + tarea.getStartTime() +
                    ", Vencimiento: " + tarea.getDueDate() +
                    ", Finalización: " + (tarea.getEndTime() != null ? tarea.getEndTime() : "No finalizada") +
                    ", Duración (minutos): " + tarea.getDuration().toMinutes());
        }
    }
}
