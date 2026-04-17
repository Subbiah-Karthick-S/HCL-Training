public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public static void main(String[] args) {
        Person p = new Person("Karthick",21);
        System.out.println(p.getname());
        System.out.println(p.getage());
        p.setname("Vinoth");
        p.setage(20);
        System.out.println();
        System.out.println("After mofication");
        System.out.println(p.getname());
        System.out.println(p.getage());
    }
}
