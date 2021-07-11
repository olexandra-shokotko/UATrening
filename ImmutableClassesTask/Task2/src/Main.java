public class Main {
    public static void main(String[] args) {
        Student student = new Student("lol", 17, new Group("123", "B"));
        Group group = student.getGroup();
        System.out.println(group);
        group.setGroup("234");
        group.setSubgroup("A");
        System.out.println(student.getGroup());
    }
}
