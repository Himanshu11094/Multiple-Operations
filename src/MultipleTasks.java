import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 


//
//Decompiled by Procyon v0.5.36
//

class Operation
{
 boolean validity(final int number) {
     int i = 0;
     final String integerToString = String.valueOf(number);
     for (int j = integerToString.length() - 1; i < j; ++i, --j) {
         if (integerToString.charAt(i) != integerToString.charAt(j)) {
             return false;
         }
     }
     return true;
 }
 
 public void checkPalindrome() {
     final Scanner user4 = new Scanner(System.in);
     System.out.println("Enter the num you want to check: ");
     final String status = String.valueOf(this.validity(user4.nextInt()));
     System.out.println("Status of the number: " + status);
 }
 
 public void printPattern() {
     final Scanner user1 = new Scanner(System.in);
     System.out.println("Enter the num of rows you need: ");
     for (int rows = user1.nextInt(), i = 0; i < rows; ++i) {
         for (int j = rows - i; j > 0; --j) {
             System.out.print("*");
         }
         System.out.print("\n");
     }
 }
 
 boolean finalCheck(final int number) {
     for (int i = 2; i < number; ++i) {
         if (number % i == 0) {
             return false;
         }
     }
     return true;
 }
 
 public void checkPrimeNumber() {
     String status = null;
     final Scanner user3 = new Scanner(System.in);
     System.out.println("Enter the num to check: ");
     final int check = user3.nextInt();
     if (check <= 1) {
         System.out.println("Enter the num greater than 1 (0,1:neither  prime nor a composite numbers.)");
     }
     else {
         status = String.valueOf(this.finalCheck(check));
     }
     System.out.println("Status of the number: " + status);
 }
 
 public void printFibonacciSeries() {
     int first = 0;
     int second = 1;
     final Scanner user2 = new Scanner(System.in);
     System.out.println("Enter the size of Fibonacci series you need: ");
     final int size = user2.nextInt();
     if (size == 1) {
         System.out.println("Fibonacci Series: 0");
     }
     else {
         System.out.print("Fibonacci Series: 0,1");
         for (int i = 0; i < size - 2; ++i) {
             final int third = first + second;
             System.out.print("," + third);
             first = second;
             second = third;
         }
     }
 }
}


public class MultipleTasks
{
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final Operation obj = new Operation();
        int choice;
        do {
            System.out.println("\n\nEnter your choice from below list.\n1. Find palindrome of number.\n2. Print Pattern for a given no.\n3. Check whether the no is a  prime number.\n4. Print Fibonacci series.\n--> Enter 0 to Exit.\n");
            choice = input.nextInt();
            switch (choice) {
                case 0: {
                    choice = 0;
                    continue;
                }
                case 1: {
                    obj.checkPalindrome();
                    continue;
                }
                case 2: {
                    obj.printPattern();
                    continue;
                }
                case 3: {
                    obj.checkPrimeNumber();
                    continue;
                }
                case 4: {
                    obj.printFibonacciSeries();
                    continue;
                }
                default: {
                    System.out.println("Invalid choice. Enter a valid no.\n");
                    continue;
                }
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        input.close();
    }
}