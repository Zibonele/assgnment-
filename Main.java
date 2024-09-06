/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Rowney = new Scanner(System.in);
        
        while(true){
        System.out.println("Student Management System");
        System.out.println("*************************");
        System.out.println("1. Capture a new student");
        System.out.println("2. Search for a student");
        System.out.println("3. Delete a student");
        System.out.println("4. Print student repot");
        System.out.println("5.Exit");
        System.out.println("Enter your choice");
        
        int choice = Rowney.nextInt();
        Rowney.nextLine();
        
        
        switch(choice){
        
            case 1:
                Student.saveStudent();
                break;
            case 2:
                Student.searchStudent();
                break;
            case 3:
                Student.deleteStudent();
                break;
            case 4:
                Student.studentReport();
                break;  
            case 5:
                Student.exitStudentApplication();
                break; 
                
            default:
                System.out.println("Invalid choice. Please try again");
                
        
        
        
        }  
      }   
    }
}
