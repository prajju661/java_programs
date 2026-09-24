public class teacher {
    String name;
    int age;
    String patiency;
    
    public teacher(String n,int a,String p){
    this.name=n;
    this.age=a;
    this.patiency=p;
}
void no_of_assighnments(){
    patiency+=7;
    System.out.println("the "+name+" teacher, has given 3 assignments"+" patiency: "+ patiency+" age: "+age);
}
void teachingskills(){
    patiency+=7;
    System.out.println("the "+name+" teacher, has good teaching skills"+" patiency: "+ patiency+" age: "+age);
}
void display(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
    System.out.println("patiency:"+patiency);
}
public static void main(String[] args){
    teacher t1=new teacher("Honey",30,"good");
    t1.display();
    t1.no_of_assighnments();
    t1.teachingskills();
}
}

