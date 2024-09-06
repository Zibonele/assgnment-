/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalincometax;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class PersonalIncomeTax {

    public static void main(String[] args) {

        final int SENTINEL = -1;

        // Declaring Variables
        double salary;
        double totalTax = 0.0;
        double netIncome;
        int taxBracket;

        // Use imported scanner to get user input
        Scanner Rowney = new Scanner(System.in);

        // Output South Africa's Tax Bracket
        System.out.println("South Africa's Income Tax Brackets For 2023/2024");
        System.out.println("1. R0 – R237,100: 18% of taxable income");
        System.out.println("2. R237,101 – R370,500: R42,678 + 26% of taxable income above R237,100");
        System.out.println("3. R370,501 – R512,800: R77,362 + 31% of taxable income above R370,500");
        System.out.println("4. R512,801 – R673,000: R121,475 + 36% of taxable income above R512,800");
        System.out.println("5. R673,001 – R857,900: R179,147 + 39% of taxable income above R673,000");
        System.out.println("6. R857,901 – R1,817,000: R251,258 + 41% of taxable income above R857,900");
        System.out.println("7. R1,817,001 and above: R644,489 + 45% of taxable income above R1,817,000");

        // Use a while loop to read the first input
        System.out.print("Enter your annual salary (or -1 to end): ");
        salary = Rowney.nextDouble();

        while (salary != SENTINEL) {
            // Prompt user to enter their tax bracket
            System.out.print("Enter your tax bracket (1-7): ");
            taxBracket = Rowney.nextInt();

            // Use loop to calculate tax based on the chosen bracket
            if (taxBracket == 1) {
                totalTax = salary * 0.18;
            } else if (taxBracket == 2) {
                if (salary > 237100) {
                    totalTax = 42678 + (salary - 237100) * 0.26;
                }
            } else if (taxBracket == 3) {
                if (salary > 370500) {
                    totalTax = 77362 + (salary - 370500) * 0.31;
                }
            } else if (taxBracket == 4) {
                if (salary > 512800) {
                    totalTax = 121475 + (salary - 512800) * 0.36;
                }
            } else if (taxBracket == 5) {
                if (salary > 673000) {
                    totalTax = 179147 + (salary - 673000) * 0.39;
                }
            } else if (taxBracket == 6) {
                if (salary > 857900) {
                    totalTax = 251258 + (salary - 857900) * 0.41;
                }
            } else if (taxBracket == 7) {
                if (salary > 1817000) {
                    totalTax = 644489 + (salary - 1817000) * 0.45;
                }
            } else {
                System.out.println("Invalid tax bracket entered.");
                continue;  
            }

            // Calculate net income
            netIncome = salary - totalTax;

            // OutPut the results
            System.out.println("Your total tax payable is: R" + String.format("%.2f", totalTax));
            System.out.println("Your after-tax income is: R" + String.format("%.2f", netIncome));

            // Read the next input
            System.out.print("Enter (-1) to end the program .");
        }

        System.out.println("Enter (-1) to end the program .");
        Rowney.close();
    }
}

    

