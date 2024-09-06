/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Student {
  private static ArrayList<Student> students = new ArrayList<>();
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public static void saveStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        int age;
        while (true) {
            System.out.print("Enter student age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    break;
                } else {
                    System.out.println("Invalid age. Age must be 16 or older.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number for age.");
            }
        }
        students.add(new Student(id, name, age));
        System.out.println("Student details have been successfully saved.");
    }

    public static void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.studentId.equals(id)) {
                System.out.println("Student found:");
                System.out.println("ID: " + s.studentId);
                System.out.println("Name: " + s.name);
                System.out.println("Age: " + s.age);
                return;
            }
        }
        System.out.println("Error: Student with ID " + id + " cannot be located.");
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.studentId.equals(id)) {
                System.out.print("Are you sure you want to delete this student? (y/n): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    students.remove(s);
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                return;
            }
        }
        System.out.println("Error: Student with ID " + id + " cannot be located.");
    }

    public static void studentReport() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("Student Report:");
        for (Student s : students) {
            System.out.println("ID: " + s.studentId + ", Name: " + s.name + ", Age: " + s.age);
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Exiting the application. Goodbye!");
        System.exit(0);
    }

    
    
}
