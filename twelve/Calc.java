package twelve;
import twelve.packages.*;
//import twelve.packages.Add;

import java.util.Scanner;

class Calc{
    public static void main(String[] args){
        System.out.println("Enter the first number: ");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();

        System.out.println("Enter either '+' or '-' operator: ");
        Scanner op = new Scanner(System.in);
        char operator = op.next().charAt(0);

        System.out.println("Enter the second number: ");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();

        switch (operator){
            case '+':
                Add addition = new Add(num1, num2);
                System.out.println("Sum = "+addition.getAddition());
                break;
            case '-':
                Sub subtraction = new Sub(num1, num2);
                System.out.println("Diff = "+subtraction.getSubtraction());
                break;
            default:
                System.out.println("Please enter the valid operator!");
                break;
        }

    }
}