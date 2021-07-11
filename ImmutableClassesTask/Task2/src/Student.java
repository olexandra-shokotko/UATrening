public final class Student {
    private final String name;
    private final int age;
    private final Group group;

    public Student(String name, int age, Group group){
        super();
        this.name = name;
        this.age = age;
        this.group = (Group) group.clone();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Group getGroup(){
        return (Group) group.clone();
    }
}
