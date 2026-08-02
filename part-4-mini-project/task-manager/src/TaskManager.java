import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;
    private final String fileName = "tasks.txt";

    public TaskManager() {
        tasks = new ArrayList<>();
        loadTasks();
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);

        saveTasks();

        System.out.println("Task added successfully.");
    }

    public void viewTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        System.out.println("\nYour Tasks:");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(
                (i + 1) + ". " + tasks.get(i)
            );
        }
    }

    public void completeTask(int taskNumber) {

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        Task task = tasks.get(taskNumber - 1);

        task.markAsCompleted();

        saveTasks();

        System.out.println(
            "Task marked as completed."
        );
    }

    public void deleteTask(int taskNumber) {

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.remove(taskNumber - 1);

        saveTasks();

        System.out.println(
            "Task deleted successfully."
        );
    }

    private void saveTasks() {

        try (
            PrintWriter writer =
            new PrintWriter(
                new FileWriter(fileName)
            )
        ) {

            for (Task task : tasks) {

                writer.println(
                    task.getTitle() + "|" +
                    task.getDescription() + "|" +
                    task.isCompleted()
                );
            }

        } catch (IOException e) {

            System.out.println(
                "Error saving tasks: " +
                e.getMessage()
            );
        }
    }

    private void loadTasks() {

        File file = new File(fileName);

        if (!file.exists()) {
            return;
        }

        try (
            BufferedReader reader =
            new BufferedReader(
                new FileReader(fileName)
            )
        ) {

            String line;

            while (
                (line = reader.readLine()) != null
            ) {

                String[] parts =
                    line.split("\\|");

                if (parts.length == 3) {

                    Task task =
                        new Task(
                            parts[0],
                            parts[1]
                        );

                    if (
                        Boolean.parseBoolean(parts[2])
                    ) {

                        task.markAsCompleted();
                    }

                    tasks.add(task);
                }
            }

        } catch (IOException e) {

            System.out.println(
                "Error loading tasks: " +
                e.getMessage()
            );
        }
    }
}
