class Student {

    String name;
    int age;
    int energy;
    String mood;
    float attendance;

    Student(String name, int age, int energy, String mood, float attendance) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.mood = mood;
        this.attendance = attendance;
    }

    void sleep() {
        energy += 10;
        mood = "Happy";
        System.out.println(name + " is sleeping.");
    }

    void study() {
        energy -= 10;
        mood = "Focused";
        System.out.println(name + " is studying.");
    }

    void skipClass() {
        energy -= 7;
        mood = "Guilty";
        attendance -= 0.1f;
        System.out.println(name + " skipped class.");
    }

    void takeExam() {
        energy -= 8;
        mood = "Stressed";
        System.out.println(name + " is taking exam.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
        System.out.println("Attendance: " + attendance);
    }
}


// Child class
class SuperStudent extends Student {

    String superpower;
    String supercopy;

    SuperStudent(String name, int age, int energy, String mood,
                 float attendance, String superpower, String supercopy) {

        super(name, age, energy, mood, attendance);

        this.superpower = superpower;
        this.supercopy = supercopy;
    }

    void codeAllNight() {
        energy -= 15;
        mood = "Focused";
        System.out.println(name + " is coding all night.");
    }

    void debugFor5Hours() {
        energy -= 20;
        mood = "Tired";
        System.out.println(name + " is debugging for 5 hours.");
    }

    void displaySuperStudent() {
        display();
        System.out.println("Superpower: " + superpower);
        System.out.println("Supercopy: " + supercopy);
    }
}


// Main class
class Main {

    public static void main(String[] args) {

        // Normal Student
        Student student = new Student(
                "Rahul", 20, 100, "Happy", 0.9f
        );

        System.out.println("----- NORMAL STUDENT -----");

        student.display();
        student.study();
        student.sleep();

        System.out.println();


        // Super Student
        SuperStudent superStudent = new SuperStudent(
                "Honey", 20, 100, "Happy", 0.9f,
                "Unlimited Coding",
                "Instant Debugging"
        );

        System.out.println("----- SUPER STUDENT -----");

        superStudent.displaySuperStudent();

        superStudent.codeAllNight();
        superStudent.debugFor5Hours();

        System.out.println();

        superStudent.displaySuperStudent();
    }
}