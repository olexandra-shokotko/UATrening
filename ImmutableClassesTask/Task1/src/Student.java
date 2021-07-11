public class Student {
    public String name;
    public int age;
    public String group;

    public Student(String name, int age, String group){
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Student))
            return false;

        if (o == null || o.getClass() != this.getClass())
            return false;

        Student student = (Student) o;

        return (student.name == this.name && student.age == this.age && student.group == this.group);
    }

    @Override
    public int hashCode() {
        int result = 13;
        if (name != null)
            result = 31 * result + name.hashCode();

        if (group != null)
            result = 31 * result + group.hashCode();

        return result;
    }
}
