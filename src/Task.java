public abstract class Task {
    int number;
    String textOfTask;

    public Task(int number) {
        this.number = number;
        this.textOfTask = "Task " + number;
    }
}

class Test extends Task implements Autochecked {
    String[] answers;

    public Test(int number) {
        super(number);
        answers = new String[]{"a", "b", "c"};
    }

}

class DragAndDrop extends Task implements Autochecked {
    String[][] answerChoice;

    public DragAndDrop(int number) {
        super(number);
        answerChoice = new String[][]{
                {"long","int"},
                {"String","float"}
        };
    }
}

class Code extends Task {
    String javaCode = "";

    public Code(int number) {
        super(number);
        javaCode = "Java code";
    }
}