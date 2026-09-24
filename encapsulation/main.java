package encapsulation;
class student{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class main {
    public static void main(String[] args) {
        student s1=new student();
        s1.setName("Honey");
        System.out.println(s1.getName());
    }
}