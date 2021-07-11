public class Main {
    public static void main(String[] args){
        Student s1 = new Student("lol", 17, "123");
        Student s2 = new Student("lol", 17, "123");

        if(s1.hashCode() == s2.hashCode()){
            if (s1.equals(s2))
                System.out.println("equals");
            else
                System.out.println("not equals");
        }else
            System.out.println("not equals");
    }
}
