
package compare;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static ArrayList<Student> perList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test t = new Test();

        Student p1 = new Student(18, "Ha", 8.1);
        Student p2 = new Student(20, "Anh", 7.2);

        perList.add(p1);
        perList.add(p2);

        System.out.println(perList);
        System.out.println("\n");
        t.sortStudents();
        System.out.println(perList);
    }

    public void sortStudents() {
                System.out.print("Enter the choice: ");
                String choice = sc.nextLine();
                switch (choice) {
                    case "age":
                        perList.sort(Comparator.comparing(Student::getAge));
                        break;
                    case "name":
                        perList.sort(Comparator.comparing(Student::getName));
                        break;
                    case "gpa":
                        perList.sort(Comparator.comparing(Student::getGpa));
                        break;
                }        
    }

    // Toi da sua
}

