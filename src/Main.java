// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Section 1
        int age = 12;
        double price = 15.99;
        String name = "hello";
        boolean isFalse = true;

        // Section 2
        int x = 1;
        int y = 2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(y % 3);

        // Section 3
        age = 15;
        if (age >= 18) {
            System.out.println("You can vote");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else if (age >= 0) {
            System.out.println("You exist");
        } else {
            System.out.println("What are you?");
        }

        // Section 4
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        // Section 5
        System.out.println(leapYear(2023));

        // Section 6 (Optional)
        Student billy = new Student(12, 3.9, "billy", "Ms. Patel");
        System.out.println(billy.welcome());
        System.out.println(billy.grade());

        Highschooler om = new Highschooler(16, 2.1, "om", "Ms. Patel", "staying alive", "OCC");
        System.out.println(om.welcome());

        Student testing1 = new Highschooler(16, 2.1, "testing1", "Ms. Patel", "staying alive", "OCC");
        // Casting
        // Highschooler testing2 =  new Student(16, 2.1, "testing2", "Ms. Patel");
        System.out.println(testing1.welcome());
    }

    // Section 5
    public static boolean leapYear(int year) {
        return (year % 4 == 0);
    }
}

// Section 6
class Student {
    int age;
    double GPA;
    String name, teacherName;

    Student(int age, double GPA, String name, String teacherName) {
        this.age = age;
        this.GPA = GPA;
        this.name = name;
        this.teacherName = teacherName;
    }

    String welcome() {
        return ("Hello, my name is " + this.name);
    }

    int grade() {
        return this.age - 5;
    }
}

class Highschooler extends Student {
    String major, futureCollege;
    Highschooler(int age, double GPA, String name, String teacherName, String major, String futureCollege) {
        super(age, GPA, name, teacherName);
        this.futureCollege = futureCollege;
        this.major = major;
    }

    String welcome() {
        return ("Hello, my name is " + name + ", and I hope to study " + major + " at " + this.futureCollege);
    }
}