public interface Staff {
    void helpStudent(Student student);

    default void addAdditionalMaterial() {
        System.out.println("ссылка на Хабр");
    }
}
