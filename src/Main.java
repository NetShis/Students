import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAX_TASKS = 30;
        Random random = new Random();
        Task[] tasks = new Task[MAX_TASKS];
        Mentor ivan = new Mentor("Ivan", "Ivanov", 40);
        Mentor oleg = new Mentor("Oleg", "Olegovich", 50);

        Student denis = new Student("Denis", "Zaboev", 32, ivan);
        Student artem = new Student("Artem", "Turov", 30, oleg);

        for (int i = 0; i < tasks.length; i += 3) {
            tasks[i] = new Test(i);
            tasks[i + 1] = new DragAndDrop(i);
            tasks[i + 2] = new Code(i);
        }

        while (!denis.isPassedAllTask() || !artem.isPassedAllTask()) {
            if (!denis.isPassedAllTask()) denis.solveTheTasks(random.nextInt(MAX_TASKS), tasks);
            if (!artem.isPassedAllTask()) artem.solveTheTasks(random.nextInt(MAX_TASKS), tasks);
        }
    }
}

