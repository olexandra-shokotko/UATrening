public class Worker{
    public String name;
    public int age;
    public String rang;

    public Worker(){}
    public Worker(String name, int age, String rang){
        this.name = name;
        this.age = age;
        this.rang = rang;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Rang: " + rang;
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || this.getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        return (this.age == worker.age && this.name.equals(worker.name) && this.rang.equals(worker.rang));
    }

    @Override
    public int hashCode(){
        int result = age;
        long temp;
        temp = age;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}