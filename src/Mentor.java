import java.util.Random;

public class Mentor extends Person implements Staff {
    private boolean moodOfMentor;
    Random random = new Random();

    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        moodOfMentor = true;
    }

    @Override
    public void helpStudent(Student student) {
        System.out.println(student.name + "У тебя все получится))");
    }

    public boolean checkCode(Task checkCode) {
        if (random.nextInt() > 1000) moodOfMentor = true;
        else moodOfMentor = false;

        if (moodOfMentor == false) {
            System.out.println("Ментор " + name + ": задача " + checkCode.number + " не принята!");
            return false;
        } else {
            System.out.println("Ментор " + name + ": задача " + checkCode.number + " принята!");
            return true;
        }
    }
}
