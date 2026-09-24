package polymorphism;

public class overload {
    public void display() {
        System.out.println("This is a method with no parameters.");
    }
    public void display(int a) {
        System.out.println("This is a method with one integer parameter: " + a);
    }
    public void display(String name) {
        System.out.println("This is a method with one string parameter: " + name);
    }
}
