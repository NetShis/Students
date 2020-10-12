public class Student extends Person {
    private int taskCount;
    static int taskCountAllStudents;
    private Mentor mentor;
    private boolean passedAllTask;
    private Discipline discipline = Discipline.JAVA;

    public Student(String name, String surname, int age, Mentor mentor) {
        super(name, surname, age);
        this.mentor = mentor;
        taskCount = 0;
        passedAllTask = false;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isPassedAllTask() {
        return passedAllTask;
    }

    public void setPassedAllTask(boolean passedAllTask) {
        this.passedAllTask = passedAllTask;
    }

    public void solveTheTasks(int numberOfTasksToSolve, Task[] arrayOfTasks) {
        int size = (taskCount + numberOfTasksToSolve) < arrayOfTasks.length ? taskCount + numberOfTasksToSolve : arrayOfTasks.length;
        for (int i = taskCount; i < size; i++) {
            solveTheTask(arrayOfTasks[i]);
        }

        if (taskCount == 30) {
            passedAllTask = true;
            System.out.println("Студент " + name + " на курсе " + discipline + ": решил все задачи");
        } else {
            passedAllTask = false;
            System.out.println("Студент " + name + ": решил не все задачи");
        }
    }

    private void solveTheTask(Task task) {
        if (task instanceof Autochecked) {
            System.out.print("Студент " + name);
            ((Autochecked) task).executedOfTask();
            System.out.println(task.number);
        } else {
            boolean isCorrect = false;
            while (!isCorrect)
                isCorrect = mentor.checkCode(task);
        }
        taskCount++;
        taskCountAllStudents++;
    }
}
